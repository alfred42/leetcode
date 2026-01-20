class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int[][] prefix = new int[mat.length + 1][mat[0].length + 1];

        for (int i = 1; i <= mat.length; i++) {
            for (int j = 1; j <= mat[0].length; j++) {
                prefix[i][j] = mat[i - 1][j - 1] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1]; 
            }
        }

        int left = 0, right = Math.min(mat.length, mat[0].length);
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFind(prefix, mid, threshold)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private boolean canFind(int[][] prefix, int k, int threshold) {
        for (int i = k; i <= prefix.length - 1; i++) {
            for (int j = k; j <= prefix[0].length - 1; j++) {
                int sum = prefix[i][j] - prefix[i - k][j] - prefix[i][j - k] + prefix[i - k][j - k];

                if (sum <= threshold) {
                    return true;
                }
            }
        }

        return false;
    }
}
