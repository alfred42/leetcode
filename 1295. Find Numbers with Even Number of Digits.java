class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            if (num / 10 >= 1 && num / 10 < 10) {
                answer++;
            }

            if (num / 10 >= 100 && num / 10 < 1000) {
                answer++;
            }

            if (num == 100000) {
                answer++;
            }
        }

        return answer;
    }
}
