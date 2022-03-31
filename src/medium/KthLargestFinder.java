package medium;

import java.util.PriorityQueue;

public class KthLargestFinder {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : nums) {
            priorityQueue.add(num);

            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }

        if (priorityQueue.isEmpty()) {
            throw new RuntimeException();
        }

        return priorityQueue.peek();
    }
}
