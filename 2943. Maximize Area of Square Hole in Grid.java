class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int side = Math.min(maxGap(hBars), maxGap(vBars));
        return side * side;
    }

    private int maxGap(int[] bars) {
        if (bars == null || bars.length == 0) return 1;

        Arrays.sort(bars);

        int maxLength = 1;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
                maxLength = Math.max(maxLength, current);
            } else {
                current = 1;
            }
        }

        return maxLength + 1;
    }
}