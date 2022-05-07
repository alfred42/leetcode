class Solution {
    public String reversePrefix(String word, char ch) {
        if (word == null || word.length() == 0) return word;

        char[] chars = word.toCharArray();

        int rightIndex = 0;

        for (;rightIndex < chars.length; rightIndex++) {
            if (chars[rightIndex] == ch) {
                break;
            }
        }

        if (rightIndex == chars.length) return word;

        int leftIndex = 0;

        while (leftIndex < rightIndex) {
            char temp = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return new String(chars);
    }
}