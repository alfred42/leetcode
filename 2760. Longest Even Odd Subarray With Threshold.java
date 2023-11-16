class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLength = 0;

        int currentLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentLength == 0) {
                if (nums[i] % 2 == 0 && nums[i] <= threshold) currentLength++;
            } else if (nums[i] % 2 != nums[i - 1] % 2 && nums[i] <= threshold) {
                currentLength++;
            } else {
                currentLength = nums[i] % 2 == 0 && nums[i] <= threshold? 1 : 0;
            }

            maxLength = Math.max(currentLength, maxLength);
        }

        return maxLength;
    }
}