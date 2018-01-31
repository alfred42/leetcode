class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        boolean flag = false;
        for (int i = 0; i < obstacleGrid.length; i++) {
            if (!flag) {
                if (obstacleGrid[i][0] == 0) dp[i][0] = 1;
                else {
                    dp[i][0] = 0;
                    flag = true;
                } 
            }
            else dp[i][0] = 0;
        }
        
        flag = false;
        
        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (!flag) {
                if (obstacleGrid[0][i] == 0) dp[0][i] = 1;
                else {
                    dp[0][i] = 0;
                    flag = true;
                } 
            }
            else dp[0][i] = 0;
        }
        
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}