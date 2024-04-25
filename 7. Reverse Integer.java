class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) x = -x;

        int result = 0;

        while (x != 0) {
            int temp = x % 10;
            if ((result * 10 + temp) / 10 != result) return 0;
            result = result * 10 + temp;
            x /= 10;
        }

        return negative ? -result : result;
    }
}