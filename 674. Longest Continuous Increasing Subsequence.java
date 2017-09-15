class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        
        int previous = Integer.MIN_VALUE;
        int currentLength = 0;
        for (int num : nums) {
            if (num > previous) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
            previous = num;
        }
        
        return maxLength;
    }
}