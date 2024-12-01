class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i = i + 2) {
            answer[i] = nums[i + 1];
            answer[i + 1] = nums[i];
        }

        return answer;
    }
}