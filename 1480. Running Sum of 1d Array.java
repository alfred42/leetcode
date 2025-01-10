class Solution {
    public int[] runningSum(int[] nums) {
        int count = 0;

        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            count += nums[i];
            answer[i] = count;
        }

        return answer;
    }
}