class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxCount = 0;
        
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        
        int minLength = nums.length;
        
        for (Integer num : map.keySet()) {
            if (map.get(num) == maxCount) {
                System.out.println(num + " " + map.get(num));
                int left = 0;
                int right = nums.length - 1;
                
                while (nums[left] != num) left++;
                while (nums[right] != num) right--;
                System.out.println(num);
                System.out.println(left + " " + right);
                minLength = Math.min(minLength, right - left + 1);
            }
        }
        
        return minLength;
    }
}