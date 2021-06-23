class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int leftIndex = 0;
        int rightIndex = 0;
        int maxLength = 0;

        int[] countArray = new int[256];

        while (rightIndex < s.length()) {
            countArray[(int) s.charAt(rightIndex)]++;

            while (countArray[(int) s.charAt(rightIndex)] == 2) {
                countArray[(int) s.charAt(leftIndex++)]--;
            }

            rightIndex++;
            maxLength = Math.max(maxLength, rightIndex - leftIndex);
        }

        return maxLength;
    }
}