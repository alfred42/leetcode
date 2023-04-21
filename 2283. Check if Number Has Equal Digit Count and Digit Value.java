class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];
        char[] charArray = num.toCharArray();

        for (char c : charArray) {
            count[c - '0']++;
        }

        for(int i = 0; i < charArray.length; i++) {
            if (count[i] != charArray[i] - '0') {
                return false;
            }
        }

        return true;
    }
}