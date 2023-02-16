class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;

        char[] chars = password.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!lower && chars[i] >= 'a' && chars[i] <= 'z') lower = true;
            if (!upper && chars[i] >= 'A' && chars[i] <= 'Z') upper = true;
            if (!digit && chars[i] >= '0' && chars[i] <= '9') digit = true;
            if (!special && (chars[i] == '!' || chars[i] == '@' || chars[i] == '#' || chars[i] == '$' || chars[i] == '%' || chars[i] == '^' || chars[i] == '&' || chars[i] == '*' || chars[i] == '(' || chars[i] == ')' || chars[i] == '-' || chars[i] == '+')) {
                special = true;
            }

            if (i != 0) {
                if (chars[i] == chars[i - 1]) return false;
            }
        }

        return lower && upper && digit && special;
    }
}