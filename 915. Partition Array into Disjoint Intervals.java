class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] dp = new int[nums.length];

        dp[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            dp[i] = nums[i] < dp[i + 1] ? nums[i] : dp[i + 1];
        }

        System.out.println(Arrays.toString(dp));

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);

            if (max <= dp[i + 1]) {
                return i + 1;
            }
        }

        return -1;
    }
}