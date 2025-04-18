class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        long answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;

            answer += i - map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return answer;
    }
}