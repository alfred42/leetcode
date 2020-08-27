class Solution {
    private boolean hit;

    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        hit = false;
        
        return validPalindrome(s, 0, s.length() - 1);
    }

    public boolean validPalindrome(String s, int startIndex, int endIndex) {
        if (startIndex > endIndex) return true;

        if (s.charAt(startIndex) == s.charAt(endIndex)) return validPalindrome(s, startIndex + 1, endIndex - 1);
        else {
            if (hit) {
                return false;
            } else {
                hit = true;
                return validPalindrome(s, startIndex, endIndex - 1) || validPalindrome(s, startIndex + 1, endIndex);
            }
        }
    }
}