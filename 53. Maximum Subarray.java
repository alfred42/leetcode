class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int pre = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = Math.max(pre + nums[i], nums[i]);
            max = Math.max(max, current);
            pre = current;
        }

        return max;
    }
}