class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i = 0;

        while (start - i >= 0 || start + i < nums.length) {
            if (start - i >= 0 && nums[start - i] == target) return Math.abs(i);

            if (start + i < nums.length && nums[start + i] == target) return Math.abs(i);

            i++;
        }

        return -1;
    }
} 
