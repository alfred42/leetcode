class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (!containsZero(i) && !containsZero(n - i)) {
                return new int[] {i, n - i};
            }
        }

        return null;
    }

    private boolean containsZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return true;
            } else {
                n /= 10;
            }
        }

        return false;
    }
}