class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;

        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int[] square : squares) {
            totalArea = totalArea + (long) square[2] * square[2];
            minY = Math.min(minY, square[1]);
            maxY = Math.max(maxY, square[1] + square[2]);
        }

        double targetArea = totalArea / 2.0;

        double left = minY;
        double right = maxY;

        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            double area = calculateAreaBelow(squares, mid);

            if (area < targetArea) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return (left + right) / 2.0;
    }

    private double calculateAreaBelow(int[][] squares, double y) {
        double area = 0;

        for (int[] square : squares) {

            if (y <= square[1]) {
                continue;
            } else if (y > square[1] + square[2]) {
                area = area + (long) square[2] * square[2];
            } else {
                double height = y - square[1];
                area += square[2] * height;
            }
        }

        return area;
    }
}