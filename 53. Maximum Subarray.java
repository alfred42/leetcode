class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        Integer maxValue = nums[0];
        Integer current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current + nums[i] > nums[i]) {
                current = current + nums[i];
            } else {
                current = nums[i];
            }
            
            maxValue = Math.max(maxValue, current);
        }
        
        return maxValue;
    }
}