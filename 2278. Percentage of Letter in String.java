class Solution {
    public int percentageLetter(String s, char letter) {
        char[] charArray = s.toCharArray();

        int count = 0;

        for (char c : charArray) {
            if (c == letter) {
                count++;
            }
        }

        return (int) (count * 100 / charArray.length);
        
    }
}