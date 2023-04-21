class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] dp = new int[2];

        int sameCount = 0;

        for (int i = 1; i < tops.length; i++) {
            if (tops[i] == bottoms[i]) sameCount++;

            if (dp[0] == -1) {
                dp[0] = -1;
            } else if (tops[0] == tops[i]) {
                dp[0] = dp[0];
            } else if (tops[0] == bottoms[i]) {
                dp[0] += 1;
            } else {
                dp[0] = -1;
            }
            
            if (dp[1] == -1) {
                dp[1] = -1;
            } else if (bottoms[0] == bottoms[i]) {
                dp[1] = dp[1];
            } else if (bottoms[0] == tops[i]) {
                dp[1] += 1;
            } else {
                dp[1] = -1;
            }
        }

        if (dp[0] == -1 && dp[1] == -1) return -1;

        dp[0] = dp[0] != -1 ? Math.min(dp[0], tops.length - dp[0] - sameCount) : Integer.MAX_VALUE;
        dp[1] = dp[1] != -1 ? Math.min(dp[1], tops.length - dp[1] - sameCount) : Integer.MAX_VALUE;
        
        return Math.min(dp[0], dp[1]);
    }
}