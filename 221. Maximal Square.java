class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        
        int answer = Integer.MIN_VALUE;
        
        int dp[][] = new int[matrix.length][matrix[0].length];
        
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = matrix[i][0] - '0';
            answer = Math.max(answer, dp[i][0]);
        }
        
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = matrix[0][i] - '0';
            answer = Math.max(answer, dp[0][i]);
        }
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (matrix[i][j] == '0') dp[i][j] = 0;
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
                answer = Math.max(answer, dp[i][j]);
            }
        }
        
        return answer * answer;
    }
}