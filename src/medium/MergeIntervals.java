package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval implements Comparable<Interval> {
    private int from;
    private int to;

    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public Interval merge(Interval interval) {
        int from = Math.min(this.from, interval.from);
        int to = Math.max(this.to, interval.to);
        return new Interval(from, to);
    }

    public boolean shouldMerge(Interval interval) {
        return from >= interval.from && from <= interval.to ||
                interval.from >= from && interval.from <= to;
    }

    @Override
    public int compareTo(Interval otherInterval) {
        return this.from - otherInterval.from;
    }
}

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<Interval> intervalList = new ArrayList<>();

        for (int[] interval : intervals)
            intervalList.add(new Interval(interval[0], interval[1]));

        Collections.sort(intervalList);

        List<Interval> mergedIntervals = new ArrayList<>();

        Interval current = intervalList.get(0);

        for (int i = 1; i < intervalList.size(); i++) {
            if (current.shouldMerge(intervalList.get(i)))
                mergedIntervals.add(current.merge(intervalList.get(i)));
            else
                mergedIntervals.add(current);

            current = intervalList.get(i);
        }

        for (int i = 0; i < mergedIntervals.size(); i++) {
            intervals[i] = new int[]{mergedIntervals.get(i).getFrom(), mergedIntervals.get(i).getTo()};
        }

        return intervals;
    }
}
