class Solution {
    public int pivotIndex(int[] nums) {
        long sum = 0;
        
        for (int num : nums) {
            sum += num;
        }
        
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp + temp == sum - nums[i]) return i;
            
            temp += nums[i];
        }
        
        return -1;
    }
}