class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    int left = answer.get(i - 1).get(j - 1);
                    int right = answer.get(i - 1).get(j);
                    current.add(left + right);
                }
            }

            answer.add(current);
        }

        return answer;
    }
}