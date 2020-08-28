class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        int result = max;

        for (int i = 1; i < nums.length; i++) {
            int newMin = Math.min(nums[i], Math.min(max * nums[i], min * nums[i]));
            int newMax = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));

            result = Math.max(result, newMax);

            min = newMin;
            max = newMax;
        }

        return result;
    }
}