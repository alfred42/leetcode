class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows == 0) return result;
        
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>(i);
            
            for (int k = 0; k < i; k++) {
                temp.add(1);
            }
            
            for (int j = 1; j < temp.size() - 1; j++) {
                temp.set(j, result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
            }
            
            result.add(temp);
        }
        
        return result;
    }
}