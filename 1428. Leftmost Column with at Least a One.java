/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int rowCount = binaryMatrix.dimensions().get(0);
        int colCount = binaryMatrix.dimensions().get(1);

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < rowCount; i++) {
            int left = 0; 
            int right = colCount - 1;

            if (binaryMatrix.get(i, right) == 0) continue;

            while (left != right) {
                int mid = left + (right - left) / 2;

                if (binaryMatrix.get(i, mid) == 1) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            answer = Math.min(answer, left);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
        
    }
}