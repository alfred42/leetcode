class Solution {
    public int countBinarySubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int preLength = 0; 
        int currentLength = 0;
        
        int answer = 0;
        char currentChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                currentLength++;
            } else {
                answer += Math.min(currentLength, preLength);
                currentChar = c;
                preLength = currentLength;
                currentLength = 1;
            }
        }
        answer += Math.min(currentLength, preLength);
        return answer;
    }
}