class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int max = 0;

        int[] sums = new int[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 0);

        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];

            if (!map.containsKey(sums[i])) {
                map.put(sums[i], i);
            }
        }

        for (int i = sums.length - 1; i > max; i--) {
            if (map.containsKey(sums[i] - k)) {
                max = Math.max(max, i - map.get(sums[i] - k));
            }
        }

        return max;
    }
}