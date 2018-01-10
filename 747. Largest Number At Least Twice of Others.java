class Solution {
    public int dominantIndex(int[] nums) {
        int biggestIndex = -1;
        int biggest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= biggest) {
                biggestIndex = i;
                second = biggest;
                biggest = nums[i];
            } else if (nums[i] >= second) {
                second = nums[i];
            }
        }
        
        return (biggest >= 2 * second)? biggestIndex: -1;
    }
}