class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalSeconds = 0;
        for (int i = 1; i < points.length; i++) {
            int absX = Math.abs(points[i][0] - points[i - 1][0]);
            int absY = Math.abs(points[i][1] - points[i - 1][1]);

            totalSeconds += Math.max(absX, absY);
        }

        return totalSeconds;
    }
}