class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] counter = new int[256];

        for (char c : s.toCharArray()) {
            counter[c]++; 
        }

        boolean hit = false;

        for (int c : counter) {
            if (c % 2 != 0) {
                if (hit) return false;
                hit = true;
            }
        }

        return true;
    }
}