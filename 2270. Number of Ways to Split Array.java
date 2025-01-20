class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;

        for (int num : nums) {
            sum+= num;
        }

        int answer = 0;
        long left = 0; 
        long right = sum;

        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) answer++;
        }

        return answer;
    }
}