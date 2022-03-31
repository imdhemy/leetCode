package hard;

import java.util.PriorityQueue;

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
class MedianFinder {
    final private PriorityQueue<Integer> firstHalf;
    final private PriorityQueue<Integer> secondHalf;

    public MedianFinder() {
        firstHalf = new PriorityQueue<>((a, b) -> b - a);
        secondHalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (firstHalf.size() == 0 || num <= firstHalf.peek()) {
            firstHalf.add(num);

            if (firstHalf.size() > secondHalf.size() + 1)
                secondHalf.add(firstHalf.poll());

            return;
        }

        secondHalf.add(num);
        if (secondHalf.size() > firstHalf.size())
            firstHalf.add(secondHalf.poll());
    }

    public double findMedian() {
        if (firstHalf.isEmpty())
            throw new RuntimeException();
        
        if (firstHalf.size() > secondHalf.size()) {
            return (double) firstHalf.peek();
        }

        double sum = firstHalf.peek() + secondHalf.peek();
        return sum / 2;
    }
}