package ctci.stacksandqueues;

public class ThreeInOne {
    public static class FixedMultiStack {
        public static final int NUM_OF_STACKS = 3;
        private final int stackCapacity;
        private final int[] values;
        private final int[] sizes;

        public FixedMultiStack(int stackSize) {
            stackCapacity = stackSize;
            values = new int[stackSize * NUM_OF_STACKS];
            sizes = new int[3];
        }

        public void push(int stackNum, int value) {
            if (isFull(stackNum)) throw new RuntimeException();

            int topIndex = indexOfTop(stackNum);
            sizes[stackNum]++;
            values[topIndex] = value;
        }

        public int pop(int stackNum) {
            if (isEmpty(stackNum)) throw new RuntimeException();

            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;

            return value;
        }

        public int peek(int stackNum) {
            if (isEmpty(stackNum)) throw new RuntimeException();

            int topIndex = indexOfTop(stackNum);
            return values[topIndex];
        }

        public boolean isEmpty(int stackNum) {
            return sizes[stackNum] == 0;
        }

        public boolean isFull(int stackNum) {
            return sizes[stackNum] == stackCapacity;
        }

        private int indexOfTop(int stackNum) {
            int offset = stackNum + stackCapacity;
            int size = sizes[stackNum];
            return offset + size - 1;
        }
    }
}
