class Solution {
    public boolean validPalindromeFull(char[] cArray, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if (cArray[startIndex] != cArray[endIndex]) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        } 
        return true;
    }
    
    public boolean validPalindrome(String s) {
        char[] cArray = s.toCharArray();
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (cArray[i] != cArray[s.length() - 1 - i]) {
                return validPalindromeFull(cArray, i, s.length() - i - 2) || validPalindromeFull(cArray, i + 1, s.length() - i - 1);
            }
        }
        
        return true;
    }
}