class Solution {
    private long maxArea = 0;

    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {

        for (int i = 0; i < bottomLeft.length - 1; i++) {
            for (int j = i + 1; j < bottomLeft.length; j++) {
                calculateArea(bottomLeft, topRight, i, j);
            }
        }

        return maxArea;
    }

    private void calculateArea(int[][] bottomLeft, int[][] topRight, int i, int j) {
        int bottomLeftX = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
        int bottomLeftY = Math.max(bottomLeft[i][1], bottomLeft[j][1]);

        int topRightX = Math.min(topRight[i][0], topRight[j][0]);
        int topRightY = Math.min(topRight[i][1], topRight[j][1]);

        if (bottomLeftX >= topRightX || bottomLeftY >= topRightY) return;

        int width = topRightX - bottomLeftX;
        int height = topRightY - bottomLeftY;

        int a = Math.min(width, height);

        maxArea = Math.max(maxArea,  (long)  a * a);
    }
}