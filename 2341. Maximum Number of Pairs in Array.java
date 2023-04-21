class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] counter = new int[101];

        for (int num : nums) {
            counter[num]++;
        }

        int pairs = 0;
        int left = 0;

        for (int c : counter) {
            pairs += c / 2;
            left += c % 2;
        }

        return new int[] {pairs, left};
    }
}