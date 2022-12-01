class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int answer = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < points.length; i++) {
            if (x == points[i][0]) {
                int distance = Math.abs(y - points[i][1]);
                if (distance < minDistance) {
                    answer = i;
                    minDistance = distance;
                }
            } else if (y == points[i][1]) {
                int distance = Math.abs(x - points[i][0]);
                if (distance < minDistance) {
                    answer = i;
                    minDistance = distance;
                }
            }
        }

        return answer;
    }
}