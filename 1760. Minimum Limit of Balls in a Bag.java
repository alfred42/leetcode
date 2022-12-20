class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int answer = 0;

        while (left <= right) {
            long step = 0;

            int y = left + (right - left) / 2;

            for (int num : nums) {
                step += (num - 1) / y;
            }

            if (step <= maxOperations) {
                answer = y;
                right = y - 1;
            } else {
                left = y + 1;
            }
        }

        return answer;
    }
}