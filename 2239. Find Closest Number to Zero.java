class Solution {
    public int findClosestNumber(int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int value = Integer.MIN_VALUE;

        for (int num : nums) {
            if (Math.abs(num) < minSize) {
                minSize = Math.abs(num);
                value = num;
            } else if (Math.abs(num) == minSize) {
                value = Math.max(value, num);
            }
        }

        return value;
    }
}