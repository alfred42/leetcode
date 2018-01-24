class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            int value = matrix[i][0];
            for (int j = 0; i + j < matrix.length && j < matrix[0].length; j++) {
                if (matrix[i + j][j] != value) return false;
            }
        }
        
        
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            int value = matrix[0][i];
            for (int j = 0; j < matrix.length && j + i < matrix[0].length; j++) {
                if (matrix[j][i + j] != value) return false;
            }
        }
        
        return true;
    }
}