class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] temp = new int[matrix[0].length];

        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    temp[j]++;
                } else {
                    temp[j] = 0;
                }
            }

            for (int j = 0; j < matrix[0].length; j++) {
                int left = j;
                int right = j;

                while (left >= 0 && temp[left] >= temp[j]) {
                    left--;
                }

                while (right < matrix[0].length && temp[right] >= temp[j]) {
                    right++;
                }

                maxArea = Math.max(maxArea, temp[j] * (right - left - 1));
            }
        }

        return maxArea;
    }
}