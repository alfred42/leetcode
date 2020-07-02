class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int index = nums.length - 1;
        int currentSum = 0;

        List<Integer> result = new ArrayList<>();

        while (index >= 0 && currentSum <= sum) {
            currentSum += nums[index];
            sum -= nums[index];

            result.add(nums[index]);

            index--;
        }

        return result;
    }
}