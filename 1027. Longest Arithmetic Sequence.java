class Solution {
    public int longestArithSeqLength(int[] A) {
        int ans = 2;

        Map<Integer, Integer>[] dp = new HashMap[A.length];

        for (int i = 0; i < A.length; i++) {
            dp[i] = new HashMap<>();

            for (int j = 0; j < i; j++) {
                int diff = A[i] - A[j];

                if (dp[j].containsKey(diff)) {
                    dp[i].put(diff, dp[j].get(diff) + 1);
                } else {
                    dp[i].put(diff, 2);
                }

                ans = Math.max(ans, dp[i].get(diff));
            }
        }

        return ans;
    }
}