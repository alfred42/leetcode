class Solution {
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        
        int[] digitSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            digitSum[i] = getDigitSum(nums[i]);
        }
        
        int max = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (map.containsKey(digitSum[i]) && map.get(digitSum[i]) != -1) {
                max = Math.max(max, map.get(digitSum[i]) + nums[i]);
                map.put(digitSum[i], -1);
            } else {
                map.put(digitSum[i], nums[i]);
            }
        }
        
        return max;
    }
    
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
}