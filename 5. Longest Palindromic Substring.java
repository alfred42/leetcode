class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        char[] array = s.toCharArray();

        int longestLength = 1;
        int longestLeftIndex = 0;
        int longestRightIndex = 1;

        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] == array[i + 1]) {
                int leftIndex = i;
                int rightIndex = i + 2;

                while (leftIndex - 1 >= 0 && rightIndex < array.length && array[leftIndex - 1] == array[rightIndex]) {
                    leftIndex--;
                    rightIndex++;
                }

                if (rightIndex - leftIndex > longestLength) {
                    longestLength = rightIndex - leftIndex;
                    longestLeftIndex = leftIndex;
                    longestRightIndex = rightIndex;
                }
            }

            int leftIndex = i;
            int rightIndex = i + 1;

            while (leftIndex - 1 >= 0 && rightIndex < array.length && array[leftIndex - 1] == array[rightIndex]) {
                leftIndex--;
                rightIndex++;
            }

            if (rightIndex - leftIndex > longestLength) {
                longestLength = rightIndex - leftIndex;
                longestLeftIndex = leftIndex;
                longestRightIndex = rightIndex;
            }
        }

        return s.substring(longestLeftIndex, longestRightIndex);
    }
}