class Solution {
    int maxLength = 1;
    int maxLeftIndex = 0;
    int maxRightIndex = 0;
    public String longestPalindrome(String s) {
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            scanPalindrome(s, i);
        }
        
        return s.substring(maxLeftIndex, maxRightIndex + 1);
    }
    
    public void scanPalindrome(String s, int index) {
        int maxOdd = 1;
        int maxEven = 0;
        
        if (index + 1 < s.length() && s.charAt(index) == s.charAt(index + 1)) {
            maxEven = 2;
            int i = 1;
            for (; index - i >= 0 && index + 1 + i < s.length(); i++) {
                if (s.charAt(index - i) == s.charAt(index + 1 + i)) {
                    maxEven += 2;
                } else {
                    break;
                }
            }
            
            if (maxEven > maxLength) {
                maxLength = maxEven;
                maxLeftIndex = index - i + 1;
                maxRightIndex = index + i;
            }
        } 
        
        int i = 1;
        for (; index - i >= 0 && index + i < s.length(); i++) {
            if (s.charAt(index - i) == s.charAt(index + i)) {
                maxOdd += 2;
            } else {
                break;
            }
        }
        
        if (maxOdd > maxLength) {
            maxLength = maxOdd;
            maxLeftIndex = index - i + 1;
            maxRightIndex = index + i - 1;
        }
    }
}