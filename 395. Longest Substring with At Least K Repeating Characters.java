public class Solution {
    public int longestSubstring(String s, int k) {
        return longestSubstring(s, 0, s.length() - 1, k);
    }
    
    public int longestSubstring(String s, int start, int end, int k) {
        if (start > end) return 0;
        
        int[] counts = new int[26];
        
        for (int i = start; i <= end; i++) {
            counts[s.charAt(i) - 'a']++;
        }
        
        for (int i = start; i <= end; i++) {
            if (counts[s.charAt(i) - 'a'] > 0 && counts[s.charAt(i) - 'a'] < k) {
                int left = longestSubstring(s, start, i - 1, k);
                int right = longestSubstring(s, i + 1, end, k);
                return Math.max(left, right);
            }
        }
        
        return end - start + 1;
    }
}