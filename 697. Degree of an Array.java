class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        Set<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                set = new HashSet<>();
                set.add(entry.getKey());
            } else if (entry.getValue() == max) {
                set.add(entry.getKey());
            }
        }

        Map<Integer, Integer> minMap = new HashMap<>();
        Map<Integer, Integer> maxMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                if (!minMap.containsKey(nums[i])) minMap.put(nums[i], i);
                maxMap.put(nums[i], i);
            }
        }

        int min = Integer.MAX_VALUE;

        for (Integer i : set) {
            min = Math.min(min, maxMap.get(i) - minMap.get(i) + 1);
        }

        return min;
    }
}