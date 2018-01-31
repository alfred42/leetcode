class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        if (nums.length == 1) return nums[0];
        
        return Math.max(robHelper(nums, 1, nums.length - 1), robHelper(nums, 0, nums.length - 2));
    }
    
    public int robHelper(int[] nums, int left, int right) {
        
        int rob = nums[left];
        int notRob = 0;
        
        for (int i = left + 1; i <= right; i++) {
            int robNext = notRob + nums[i];
            int notRobNext = Math.max(rob, notRob);
            rob = robNext;
            notRob = notRobNext;
        }
        
        return Math.max(rob, notRob);
    }
}