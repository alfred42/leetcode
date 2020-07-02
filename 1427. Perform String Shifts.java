class Solution {
    public String stringShift(String s, int[][] shift) {
        int totalStep = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                totalStep += shift[i][1];
            } else {
                totalStep -= shift[i][1];
            }
        }

        totalStep %= s.length();
        if (totalStep < 0) totalStep += s.length();
        
        return s.substring(totalStep, s.length()) + s.substring(0, totalStep);
    }
}