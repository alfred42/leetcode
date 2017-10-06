class Solution {
    public void moveZeroes(int[] nums) {
        int leftIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[leftIndex] = nums[i];
                leftIndex++;
            }
        }
        
        while (leftIndex < nums.length) {
            nums[leftIndex] = 0;
            leftIndex++;
        }
    }
}