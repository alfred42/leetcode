class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        if (nums == null) return result;
        int lessCount = 0;
        int greaterCount = 0;
        for (int num : nums) {
            if (num > target) greaterCount++;
            else if (num < target) lessCount++;
        }

        for (int i = lessCount; i < nums.length - greaterCount; i++) {
            result.add(i);
        }

        return result;
    }
}