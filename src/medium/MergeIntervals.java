package medium;

import java.util.ArrayList;
import java.util.Collections;

class Interval implements Comparable<Interval> {
    private int from;
    private int to;

    private int calls;

    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
        this.calls = 0;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public void merge(Interval interval) {
        this.from = Math.min(this.getFrom(), interval.getFrom());
        this.to = Math.max(this.getTo(), interval.getTo());
    }

    public int[] toArray() {
        return new int[]{from, to};
    }

    public boolean isOverlapping(Interval interval) {
        return interval.getFrom() >= this.getFrom()
                && interval.getFrom() <= this.getTo();
    }

    @Override
    public int compareTo(Interval interval) {
        return this.getFrom() - interval.getFrom();
    }
}

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if (intervals.length < 2) {
            return intervals;
        }

        ArrayList<Interval> intervalList = new ArrayList<>();
        ArrayList<Interval> mergedIntervals = new ArrayList<>();

        for (int[] interval : intervals) {
            intervalList.add(new Interval(interval[0], interval[1]));
        }

        Collections.sort(intervalList);

        int i = 0;
        Interval current = intervalList.get(i);

        while (i < intervalList.size()) {
            Interval next = intervalList.get(i);
            if (current.isOverlapping(next)) {
                current.merge(next);
            } else {
                mergedIntervals.add(current);
                current = next;
            }
            i++;
        }
        mergedIntervals.add(current);

        int[][] result = new int[mergedIntervals.size()][2];
        for (int j = 0; j < mergedIntervals.size(); j++) {
            result[j] = mergedIntervals.get(j).toArray();
        }

        return result;
    }
}
