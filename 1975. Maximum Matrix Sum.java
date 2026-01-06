class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long absSum = 0;
        long negativeCount = 0;
        long minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                absSum += Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) negativeCount++;
                minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
            }
        }

        return negativeCount % 2 == 0 ? absSum : absSum - 2 * minAbs;
    }
}