class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[0][0];
        int dy = coordinates[0][1];

        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i][0] -= dx;
            coordinates[i][1] -= dy;
        }

        int sx = coordinates[1][0];
        int sy = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {

            if (sx * coordinates[i][1] != sy * coordinates[i][0]) return false;
        }

        return true;
    }
}