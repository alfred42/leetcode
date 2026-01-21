class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            if (x == 2) {
                ans[i] = -1;
                continue;
            }

            long mask = 1L;
            while ((x & mask) != 0) {
                mask <<= 1;
            }
            long leadingOne = mask >> 1;

            ans[i] = (int) (x - leadingOne);
        }

        return ans;
    }
}