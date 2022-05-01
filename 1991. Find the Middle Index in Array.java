class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int rightSum = sum;

        int index = 0;

        while (index < nums.length) {
            if (leftSum == rightSum - nums[index]) return index;
            leftSum += nums[index];
            rightSum -= nums[index];

            index++;
        }

        return -1;
    }
}