class Solution {
    public int maxScore(String s) {
        int count0 = 0;
        int count1 = 0;

        for(char c : s.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        
        int scoreLeft = s.charAt(0) == '0' ? 1 : 0;
        int scoreRight = s.charAt(0) == '0' ? count1: count1 - 1;
        int max = scoreLeft + scoreRight;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                scoreLeft++;
            } else {
                scoreRight--;
            }

            max = Math.max(max, scoreRight + scoreLeft);
        }

        return max;
    }
}