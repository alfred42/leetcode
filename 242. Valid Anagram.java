class Solution {
    public boolean isAnagram(String s, String t) {
        int[] result = new int[256];
        
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.length() != t.length()) return false;
        
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i)]++;
            result[t.charAt(i)]--;
        }
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) return false;
        }
        
        return true;
    }
}