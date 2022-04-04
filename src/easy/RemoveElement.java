package easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }
}
