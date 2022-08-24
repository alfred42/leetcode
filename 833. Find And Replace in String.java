class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], i);    
        }
                
        String result = s;
        
        boolean[] ifReplace = new boolean[indices.length];
        
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] + sources[i].length() <= s.length() && s.substring(indices[i], indices[i] + sources[i].length()).equals(sources[i])) {
                ifReplace[i] = true;
            }
        }
        Arrays.sort(indices);
        
        int deltaLength = 0;
        
        for (int i = 0; i < indices.length; i++) {
            if (ifReplace[map.get(indices[i])]) {
                s = s.substring(0, indices[i] + deltaLength) 
                    + targets[map.get(indices[i])] 
                    + s.substring(indices[i] + deltaLength + sources[map.get(indices[i])].length(), s.length());
                deltaLength += targets[map.get(indices[i])].length() - sources[map.get(indices[i])].length();
            }
        }
        
        return s;

    }
}