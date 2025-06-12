class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxAdjance = Math.abs(nums[nums.length - 1] - nums[0]);

        for (int i = 1; i < nums.length; i++) {
            maxAdjance = Math.max(maxAdjance, Math.abs(nums[i] - nums[i - 1]));
        }

        return maxAdjance;
    }
}