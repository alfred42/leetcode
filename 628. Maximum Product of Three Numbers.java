class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int lastIndex = nums.length - 1;
        return Math.max(nums[lastIndex] * nums[lastIndex - 1] * nums[lastIndex - 2], nums[0] * nums[1] * nums[lastIndex]);
    }
}