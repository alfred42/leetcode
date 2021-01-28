class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int rightSum = totalSum - nums[0];
        int index = 0;

        while (index < nums.length) {
            if (leftSum == rightSum) {
                return index;
            }

            leftSum += nums[index];
            index++;

            if (index < nums.length) {
                rightSum -= nums[index];
            }
        }

        return -1;
    }
}