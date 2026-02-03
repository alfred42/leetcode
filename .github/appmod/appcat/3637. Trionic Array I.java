class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 4) return false;

        int i = 0;

        while (i + 1 < nums.length && nums[i] < nums[i + 1]) i++;

        int p = i;
        if (p == 0) return false;

        while (i + 1 < nums.length && nums[i] > nums[i + 1]) i++;
        int q = i;
        if (q == p) return false;
        if (q == nums.length - 1) return false;

        while (i + 1 < nums.length && nums[i] < nums[i + 1]) i++;

        return i == nums.length - 1;
    }
}