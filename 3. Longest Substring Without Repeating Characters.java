class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= left) {
                left = map.get(s.charAt(i)) + 1;
            }
            
            maxLength = Math.max(maxLength, i - left + 1);
            map.put(s.charAt(i), i);
        }
        
        return maxLength;
    }
}