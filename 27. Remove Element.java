class Solution {
    public int removeElement(int[] nums, int val) {
        int leftIndex = 0;
        int rightIndex = 0;

        while (rightIndex < nums.length) {
            if (nums[rightIndex] != val) {
                nums[leftIndex] = nums[rightIndex];
                leftIndex++;
            }

            rightIndex++;
        }

        return leftIndex;
    }
}