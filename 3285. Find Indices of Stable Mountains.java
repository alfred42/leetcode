class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();

        if (height == null) return result;

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }

        return result;
    }
}