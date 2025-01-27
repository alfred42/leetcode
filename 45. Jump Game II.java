class Solution {
    public int jump(int[] nums) {
        int maxIndex = 0;
        int steps = 0;
        int target = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (i == target) {
                target = maxIndex;
                steps++;
            }
        }
        
        return steps;
    }
}