class Solution {
    public int countDigits(int num) {
        int d = num;
        int count = 0;

        while (d > 0) {
            int temp = d % 10;

            if (num % temp == 0) {
                count++;
            }

            d /= 10;
        }

        return count;
    }
}