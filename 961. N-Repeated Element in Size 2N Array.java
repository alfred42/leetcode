class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxCount = 0;
        int maxNum = 0;
        
        for (int i : A) {
            int newCount = map.getOrDefault(i, 0) + 1;
            map.put(i, newCount);
            if (newCount > maxCount) {
                maxCount = newCount;
                maxNum = i;
            }
        }
        
        return maxNum;
    }
}
