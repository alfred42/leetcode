class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currentSum = nums[0];
        int maxSum = currentSum;

        int prevNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prevNum) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            
            prevNum = nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }


        return maxSum;
    }
}