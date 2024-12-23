class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (!set.contains(num) && map.get(num) > 1) {
                set.add(num);
            }
        }

        if (set.size() == 0) return 0;

        int count = 0;

        for (int i = 0; i < nums.length;) {
            count++;

            if (i < nums.length) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 1) set.remove(nums[i]);
            }

            if  (i + 1 < nums.length) {
                map.put(nums[i + 1], map.get(nums[i + 1]) - 1);
                if (map.get(nums[i + 1]) == 1) set.remove(nums[i + 1]);
            }
            
            if (i + 2 < nums.length) {
                map.put(nums[i + 2], map.get(nums[i + 2]) - 1);
                if (map.get(nums[i + 2]) == 1) set.remove(nums[i + 2]);
            }

            i += 3;

            if (set.size() == 0) return count;
        }

        return count;
    }
}