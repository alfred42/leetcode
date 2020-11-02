class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int notRob = 0;
        int rob = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int preNotRob = notRob;
            notRob = Math.max(preNotRob, rob);
            rob = preNotRob + nums[i];
        }

        return Math.max(rob, notRob);
    }
}