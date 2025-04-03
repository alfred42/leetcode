class Solution {
    public long maximumTripletValue(int[] nums) {
        long answer = 0;
        long max = 0;
        long deltaMax = 0;

        for (int i = 0; i < nums.length; i++) {
            answer = Math.max(answer, deltaMax * nums[i]);
            deltaMax = Math.max(deltaMax, max - nums[i]);
            max = Math.max(max, nums[i]);
        }

        return answer;
    }
}
