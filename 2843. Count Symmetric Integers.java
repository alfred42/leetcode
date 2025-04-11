class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) count++;
        }

        return count;
    }

    public boolean isSymmetric(int value) {
        if (value >= 11 && value <= 99) {
            return value % 11 == 0;
        } else if (value >= 1001 && value <= 9999) {
            return (value % 10 + (value / 10) % 10) == ((value / 100) % 10 + (value / 1000) % 10);
        } else {
            return false;
        }
    }
}