class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentMinSum = 0;
        int currentMaxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentMinSum = Math.min(currentMinSum + num, num);
            currentMaxSum = Math.max(currentMaxSum + num, num);

            minSum = Math.min(minSum, currentMinSum);
            maxSum = Math.max(maxSum, currentMaxSum);
        }

        return Math.max(Math.abs(minSum), Math.abs(maxSum));
    }
}