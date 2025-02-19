class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = Integer.MIN_VALUE;
        int maxElement = arrays.get(0).get(arrays.get(0).size() - 1);
        int minElement = arrays.get(0).get(0);

        for (int i = 1; i < arrays.size(); i++) {
            max = Math.max(max, maxElement - arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1) - minElement);
            maxElement = Math.max(maxElement, arrays.get(i).get(arrays.get(i).size() - 1));
            minElement = Math.min(minElement, arrays.get(i).get(0));
        }

        return max;
    }
}