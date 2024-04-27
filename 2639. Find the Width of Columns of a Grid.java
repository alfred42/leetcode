class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] answer = new int[grid[0].length];

        for (int i = 0; i < answer.length; i++) {
            int maxLength = Integer.MIN_VALUE;

            for (int j = 0; j < grid.length; j++) {
                maxLength = Math.max(maxLength, String.valueOf(grid[j][i]).length());
            }

            answer[i] = maxLength;
        }

        return answer;
    }
}