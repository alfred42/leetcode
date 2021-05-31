class Solution {
    public boolean check(int[] nums) {
        boolean flag = false;

        if (nums == null || nums.length == 0) {
            return false;
        }

        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < prev) {
                if (!flag) {
                    flag = true;
                } else {
                    return false;
                }

            }

            prev = nums[i];
        }

        return flag ? nums[nums.length - 1] <= nums[0] : true;
    }
}