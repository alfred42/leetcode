class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1}; 
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] >= target) right = mid;
        }

        if (nums[left] != target) return new int[] {-1, -1};
        
        int answer0 = left;
        
        right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) left = mid + 1;
            else if (nums[mid] > target) right = mid - 1;
        }
        
        int answer1 = nums[left] == target? left: left - 1;
        
        return new int[] {answer0, answer1};
    }
}