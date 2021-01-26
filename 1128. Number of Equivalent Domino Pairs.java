class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int[] domino : dominoes) {
            String key = domino[0] <= domino[1] ? 
            String.valueOf(domino[0]) + ':' + String.valueOf(domino[1]): 
            String.valueOf(domino[1]) + ":" + String.valueOf(domino[0]);
          
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
            if (n > 1) {
                count += (n * n - n) / 2;
            }
        }

        return count;
    }
}