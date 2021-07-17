class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int preMax = 0;
        int answer = nums[0];

        for (int num : nums) {
            preMax = Math.max(preMax + num, num);
            answer = Math.max(answer, preMax);
        }

        return answer;
    }
}