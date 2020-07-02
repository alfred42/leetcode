class Solution {
    public int maxPower(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int maxCount = 1;
        int currentCount = 1;
        char current = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                current = s.charAt(i);
                currentCount = 1;
            }
        }

        return maxCount;
    }
}