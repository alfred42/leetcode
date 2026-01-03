class Solution {
    public int[] plusOne(int[] digits) {
        int c = 0;

        digits[digits.length - 1] += 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + c;
            if (digits[i] >= 10) {
                c = 1;
                digits[i] %= 10;
            } else {
                c = 0;
            }
        }

        if (c == 1) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            for (int i = 1; i < temp.length; i++) {
                temp[i] = digits[i - 1];
            }

            return temp;
        } else {
            return digits;
        }
    }
}