class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int maxLength = 1;
        String result = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            int currentLength = 0;
            int j = 0;

            while (i - j >= 0 && i + 1 + j < s.length() && s.charAt(i - j) == s.charAt(i + 1 + j)) {
                currentLength += 2;
                j++;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                result = s.substring(i - j + 1, i + j + 1);
            }

            currentLength = 1;
            j = 1;

            while (i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)) {
                currentLength += 2;
                j++;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                result = s.substring(i - j + 1, i + j);
            }
        }

        return result;
    }
}