class Solution {
    public int minStartValue(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            minValue = Math.min(minValue, sum);
        }

        return minValue >= 0 ? 1 : - minValue + 1;
    }
}