class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;

        int[][] indices = new int[grid.length * grid.length][2];    

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                indices[grid[i][j]][0] = i;
                indices[grid[i][j]][1] = j;

            }
        }

        for (int i = 1; i < grid.length * grid.length; i++) {
            int dx = Math.abs(indices[i][0] - indices[i - 1][0]);
            int dy = Math.abs(indices[i][1] - indices[i - 1][1]);
            if (dx * dy != 2) {
                return false;
            }
        }

        return true;
    }
}