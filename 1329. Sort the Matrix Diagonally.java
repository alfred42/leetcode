class Solution {
    public int[][] diagonalSort(int[][] mat) {
        boolean rowEnded = false;
        for (int k = 0; k < mat.length + mat[0].length - 1; k++) {
            List<Integer> tempList = new ArrayList<>();

            int rowOriginalCount = mat.length - 1 - k;

            int rowIndex = 0;
            int columnIndex = 0;

            if (!rowEnded) {
                rowIndex = mat.length - 1 - k;
            } else {
                columnIndex = k - mat.length + 1;
            }

            while (rowIndex < mat.length && columnIndex < mat[0].length) {
                tempList.add(mat[rowIndex][columnIndex]);
                rowIndex++;
                columnIndex++;
            }

            Collections.sort(tempList);

            if (!rowEnded) {
                rowIndex = mat.length - 1 - k;
                columnIndex = 0;
            } else {
                rowIndex = 0;
                columnIndex = k - mat.length + 1;
            }

            for (int temp : tempList) {
                mat[rowIndex][columnIndex] = temp;
                rowIndex++;
                columnIndex++;
            }

            if (rowOriginalCount == 0) rowEnded = true;
        }

        return mat;
    }
}