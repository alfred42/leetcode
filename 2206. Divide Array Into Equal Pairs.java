class Solution {
    public boolean divideArray(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) return false;
        }

        return true;
    }
}