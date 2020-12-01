class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[] {-1, -1};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int leftIndex = nums[left] == target ? left: -1;

        if (leftIndex == -1) return new int[] {-1, -1};

        left = 0;
        right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                left = mid;
            } else {
                left = mid + 1;
            }
        }
        

        return new int[] {leftIndex, right};
    }
}