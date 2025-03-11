class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] maxValues = new int[nums.length];
        int[] minValues = new int[nums.length];

        maxValues[0] = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            maxValues[i] = Math.max(maxValues[i - 1], nums[i - 1]);
        }

        minValues[nums.length - 1] = Integer.MAX_VALUE;

        for (int i = nums.length - 2; i >= 0; i--) {
            minValues[i] = Math.min(minValues[i + 1], nums[i + 1]);
        }

        int score = 0;

        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] > maxValues[i] && nums[i] < minValues[i]) {
                score += 2;
            } else if (nums[i] > nums[i - 1] && nums[i + 1] > nums[i]) {
                score++;
            }
        }

        return score;
    }
}