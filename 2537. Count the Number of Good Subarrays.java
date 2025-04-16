class Solution {
    public long countGood(int[] nums, int k) {
        int same = 0;
        int left = 0;
        int right = -1;

        HashMap<Integer, Integer> counter = new HashMap<>();

        long answer = 0;

        while (left < nums.length) {
            while (same < k && right < nums.length - 1) {
                right++;
                same += counter.getOrDefault(nums[right], 0);
                counter.put(nums[right], counter.getOrDefault(nums[right], 0) + 1);
            }

            if (same >= k) {
                answer += nums.length - right;
            }

            counter.put(nums[left], counter.get(nums[left]) - 1);
            same -= counter.get(nums[left]);

            left++;
        }

        return answer;
    }
}