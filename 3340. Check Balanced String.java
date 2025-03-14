class Solution {
    public boolean isBalanced(String num) {
        char[] charArray = num.toCharArray();

        int sumOdd = 0;
        int sumEven = 0;

        boolean isOdd = true;

        for (char c : charArray) {
            if (isOdd) {
                sumOdd += c - '0';
            } else {
                sumEven += c - '0';
            }

            isOdd = !isOdd;
        }

        return sumOdd == sumEven;
    }
}