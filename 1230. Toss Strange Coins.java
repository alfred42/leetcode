class Solution {
    public double probabilityOfHeads(double[] prob, int target) {
        double[][] dp = new double[prob.length + 1][prob.length + 1];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j + 1 < dp.length; j++) {
                dp[i][j] += dp[i - 1][j] * (1 - prob[i - 1]);
                dp[i][j + 1] += dp[i - 1][j] * prob[i - 1]; 
            }
        }

        return dp[dp.length - 1][target];
    }
}