class Solution {
    public void moveZeroes(int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;

        while (rightIndex < nums.length) {
            if (nums[rightIndex] != 0) {
                nums[leftIndex++] = nums[rightIndex++];
            } else {
                rightIndex++;
            }
        }

        while (leftIndex < nums.length) {
            nums[leftIndex++] = 0;
        }
    }
}