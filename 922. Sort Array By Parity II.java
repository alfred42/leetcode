class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 0;
        int even = 1;

        while (odd < nums.length) {
            if (nums[odd] % 2 == 0) {
                odd += 2;
            } else {
                while (nums[even] % 2 == 1) {
                    even += 2;
                }
                
                swap(nums, odd, even);
                odd += 2;
                even += 2;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int leftIndex, int rightIndex) {
        int temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;
    }
}