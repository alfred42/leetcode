class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int step = nums[i] % nums.length;
            int index = (i + step + nums.length) % nums.length;
            result[i] = nums[index];
        }

        return result;
    }
}