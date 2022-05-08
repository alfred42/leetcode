class Solution {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        int sum = 0;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }
}