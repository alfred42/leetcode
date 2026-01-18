class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] rowSum = new int[m][n];
        int[][] colSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i][j] = grid[i][j] + (j > 0 ? rowSum[i][j-1] : 0);
                colSum[i][j] = grid[i][j] + (i > 0 ? colSum[i-1][j] : 0);
            }
        }

        for (int k = Math.min(m, n); k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {
                    if (isMagic(grid, rowSum, colSum, i, j, k))
                        return k;
                }
            }
        }

        return 1;
    }

    private boolean isMagic(int[][] grid, int[][] rowSum, int[][] colSum,
                            int r, int c, int k) {

        int target = rowSum[r][c+k-1] - (c > 0 ? rowSum[r][c-1] : 0);

        for (int i = r; i < r+k; i++) {
            int sum = rowSum[i][c+k-1] - (c > 0 ? rowSum[i][c-1] : 0);
            if (sum != target) return false;
        }

        for (int j = c; j < c+k; j++) {
            int sum = colSum[r+k-1][j] - (r > 0 ? colSum[r-1][j] : 0);
            if (sum != target) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < k; i++) {
            diag1 += grid[r+i][c+i];
            diag2 += grid[r+i][c+k-1-i];
        }

        return diag1 == target && diag2 == target;
    }
}