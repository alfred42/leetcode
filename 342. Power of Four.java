class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (true) {
            if (n == 1) return true;
            else if (n % 4 == 0) {
                n /= 4;
            } else {
                return false;
            }
        }
    }
}