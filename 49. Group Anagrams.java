class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for (String str : strs) {
            if (str == null) continue;
            char[] t = str.toCharArray();
            Arrays.sort(t);
            String hash = new String(t);
            
            if (map.containsKey(hash)) {
                map.get(hash).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(hash, temp);
            }
        }
        
        for (String str : map.keySet()) {
            result.add(map.get(str));
        }
        
        return result;
    }
}