public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, 1);
        }

        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) | 2);
        }

        for (int num : nums3) {
            map.put(num, map.getOrDefault(num, 0) | 4);
        }

        List<Integer> answer = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue() & (entry.getValue() - 1)) != 0) {
                answer.add(entry.getKey());
            }
        }

        return answer;
    }
}