class Solution {
    public boolean divideArray(int[] nums) {
        int[] counter = new int[501];

        for (int num : nums) {
            counter[num]++;
        }

        for (int c : counter) {
            if (c % 2 != 0) return false;
        }

        return true;
    }
}