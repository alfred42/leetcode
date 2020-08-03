class Solution {
    public int projectionArea(int[][] grid) {
        int ans = 0;

        int xy = 0;

        int[] xz = new int[grid.length];
        int[] yz = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) xy++;

                xz[j] = Math.max(xz[j], grid[i][j]);
                yz[i] = Math.max(yz[i], grid[i][j]);
            }
        }

        ans = xy + Arrays.stream(xz).sum() + Arrays.stream(yz).sum();

        return ans;

    }
}