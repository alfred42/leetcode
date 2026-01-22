class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Long> list = new ArrayList<>();

        for (int num : nums) {
            list.add((long) num);
        }

        int answer = 0;

        while (!isNoneDecreasing(list)) {
            long minSum = Long.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                long temp = list.get(i) + list.get(i + 1);
                if (temp < minSum) {
                    minSum = temp;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index + 1);
            answer++;
        }
        
        return answer;
    }

    private boolean isNoneDecreasing(List<Long> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) return false;
        }

        return true;
    }
}