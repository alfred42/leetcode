class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[36];
        int maxCount = Integer.MIN_VALUE;

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int value = i;

            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }

            count[sum - 1]++;
            maxCount = Math.max(maxCount, count[sum - 1]);
        }

        for (int j : count) {
            if (maxCount == j) {
                answer++;
            }
        }

        return answer;
    }
}