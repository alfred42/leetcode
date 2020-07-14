class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] counter = new int[256];

        for (char c : s1.toCharArray()) {
            counter[(int) c]++;
        }

        for (char c : s2.toCharArray()) {
            counter[(int) c]--;
        }

        for (int c : counter) {
            if (c != 0) return false;
        }

        return true;
    }
}