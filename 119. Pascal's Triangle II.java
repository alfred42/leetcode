class Solution {
    public List<Integer> getRow(int rowIndex) {        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> temp = new ArrayList<>(i);
            
            for (int k = 0; k < i; k++) {
                temp.add(1);
            }
            
            for (int j = 1; j < temp.size() - 1; j++) {
                temp.set(j, result.get(j - 1) + result.get(j));
            }
            
            result = temp;
        }
        
        return result;
    }
}