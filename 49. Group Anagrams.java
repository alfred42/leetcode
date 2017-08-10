public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] tempArray = str.toCharArray();
            Arrays.sort(tempArray);
            String key = String.valueOf(tempArray);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            
            map.get(key).add(str);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}