class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int longestLength = 1;
        String result = s.substring(0, 1);

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            int index = 0;

            while (i - index >= 0 && i + index < array.length && array[i - index] == array[i + index]) {
                if (2 * index + 1 > longestLength) {
                    longestLength = 2 * index + 1;
                    result = s.substring(i - index, i + index +1);
                }

                index++;
            }

            if (i + 1 < array.length && array[i] == array[i + 1]) {
                index = 0;

                while (i - index >= 0 && i + 1 + index < array.length && array[i - index] == array[i + index + 1]) {
                    if (2 * index + 2 > longestLength) {
                        longestLength = 2 * index + 2;
                        result = s.substring(i - index, i + 2 + index);
                    }

                    index++;
                }
            }
        }

        return result;
    }
}