class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[][] = new int[cost.length][2];
        
        dp[0][0] = 0;
        dp[0][1] = cost[0];
        dp[1][0] = cost[0];
        dp[1][1] = cost[1];
        
        for (int i = 2; i < cost.length; i++) {
            dp[i][0] = dp[i - 1][1];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i];
        }
        
        return Math.min(dp[cost.length - 1][0], dp[cost.length - 1][1]);
    }
}