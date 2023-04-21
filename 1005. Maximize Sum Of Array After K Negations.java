class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] count = new int[201];

        int answer = 0;

        for (int num : nums) {
            count[num + 100]++;
            answer += num;
        }

        for (int i = 0; i < 100; i++) {
            if (count[i] > 0) {

                int c = Math.min(k, count[i]);

                answer += (- (i - 100)) * 2 * c;

                count[i] -= c;
                count[201 - i - 1] += c;
                k -= c;

                if (k == 0) break;
            }
        }

        if (k > 0 && k % 2 == 1 && count[100] == 0) {
            for (int i = 101; i < 201; i++) {
                if (count[i] != 0) {
                    answer -= (i - 100) * 2;
                    break;
                }
            }
        }

        return answer;
    }
}
