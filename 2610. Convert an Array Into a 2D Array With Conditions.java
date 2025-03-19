class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] counter = new int[201];

        int maxSize = 0;

        for (int num : nums) {
            counter[num]++;
            maxSize = Math.max(maxSize, counter[num]);
        }
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for (int i = 0; i < maxSize; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < counter.length; j++) {
                if (counter[j] > 0) {
                    list.add(j);
                    counter[j]--;
                }
            }

            answer.add(list);
        }

        return answer;
    }
}