class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] g : grid) {
            Arrays.sort(g);
        }

        int answer = 0;

        for (int j = grid[0].length - 1; j >= 0; j--) {
            int m = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                m = Math.max(m, grid[i][j]);
            }
            answer += m;
        }

        return answer;
    }
}