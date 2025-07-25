class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;

        int score = 0;
        int maxScore = 0;

        Set<Integer> set = new HashSet<>();

        while (right < nums.length) {
            if (set.contains(nums[right])) {
                while (set.contains(nums[right])) {
                    score -= nums[left];
                    set.remove(nums[left]);
                    left++;
                }
            }

            score += nums[right];
            set.add(nums[right]);
            maxScore = Math.max(score, maxScore);

            right++;
        }

        return maxScore;
    }
}