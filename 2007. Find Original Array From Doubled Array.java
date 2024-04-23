class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) return new int[] {};

        Arrays.sort(changed);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : changed) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = changed.length - 1; i >= 0; i--) {
            if (map.get(changed[i]) > 0) {
                if (changed[i] % 2 != 0 || !map.containsKey(changed[i] / 2) || map.get(changed[i] / 2) == 0) {
                    return new int[] {};
                }

                answer.add(changed[i] / 2);

                map.put(changed[i], map.get(changed[i]) - 1);
                map.put(changed[i] / 2, map.get(changed[i] / 2) - 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}