class Solution {
    public int titleToNumber(String s) {
        int answer = 0;
        int base = 1;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += base * (s.charAt(i)- 'A' + 1);
            base *= 26;
        }
        
        return answer;
    }
}