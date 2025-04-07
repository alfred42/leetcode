class Solution {
    public long maximumTripletValue(int[] nums) {
        long answer = 0;
        long imax = 0;
        long dmax = 0;

        for (int k = 0; k < nums.length; k++) {
            answer = Math.max(answer, dmax * nums[k]);
            dmax = Math.max(dmax, imax - nums[k]);
            imax = Math.max(imax, nums[k]);
        }

        return answer;
    }
}