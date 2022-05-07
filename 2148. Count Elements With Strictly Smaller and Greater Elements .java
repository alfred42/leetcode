class Solution {
    public int countElements(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int minCount = 0;
        int maxCount = 0;

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxValue) {
                maxValue = num;
                maxCount = 1;
            } else if (num == maxValue) {
                maxCount++;
            }

            if (num < minValue) {
                minValue = num;
                minCount = 1;
            } else if (num == minValue) {
                minCount++;
            }
        }

        return minValue != maxValue ? nums.length - maxCount - minCount : 0;

    }
}