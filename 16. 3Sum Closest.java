class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestDiff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                int currentDiff = Math.abs(temp - target);
                if (currentDiff < closestDiff) {
                    result = temp;
                    closestDiff = currentDiff;
                }

                if (currentDiff == 0) return result;

                if (temp > target) right--;
                else left++;
            }
        }

        return result;
    }
}