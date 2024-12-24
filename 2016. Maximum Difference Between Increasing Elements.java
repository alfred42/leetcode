class Solution {
    public int maximumDifference(int[] nums) {
        int result = Integer.MIN_VALUE;

        int currentMin = Integer.MAX_VALUE;

        for (int num : nums) {
            currentMin = Math.min(currentMin, num);
            result = Math.max(result, num - currentMin);
        }

        return result == 0 ? -1 : result;
    }
}