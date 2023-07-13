class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length;i++) {
            dp[0][i] = matrix[0][i];
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int left = j == 0 ? Integer.MAX_VALUE : dp[i - 1][j - 1];
                int right = j == matrix[0].length - 1 ? Integer.MAX_VALUE : dp[i - 1][j + 1];
                dp[i][j] = Math.min(Math.min(left, dp[i - 1][j]), right) + matrix[i][j];
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            answer = Math.min(answer, dp[dp.length - 1][i]);
        }

        return answer;
    }
}