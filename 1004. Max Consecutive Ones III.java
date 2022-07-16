class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;

        int count0 = 0;
        int maxLength = 0;

        while (right < nums.length) {
            if (nums[right] == 0) count0++;
            right++;

            while (left < nums.length && count0 > k) {
                if (nums[left] == 0) count0--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}