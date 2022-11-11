class Solution {
    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();

        int count = 0;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                count++;
            }
        }

        for (int i = chars.length / 2; i < chars.length; i++) {
                        if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                count--;
            }
        }

        return count == 0;
    }
}