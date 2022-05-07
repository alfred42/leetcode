class Solution {
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) return 0;

        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int temp = 0;

            for (int value : account) {
                temp += value;
            }

            max = Math.max(max, temp);
        }

        return max;
    }
}