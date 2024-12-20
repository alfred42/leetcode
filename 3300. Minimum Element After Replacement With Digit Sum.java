class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int v = 0;

            while (num > 0) {
                v += num % 10;
                num /= 10;
            }

            min = Math.min(min, v);
        }
        
        return min;
    }
}