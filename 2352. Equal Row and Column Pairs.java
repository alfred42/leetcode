class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (ifEqual(i, j, grid)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean ifEqual(int row, int col, int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }

        return true;
    }
}