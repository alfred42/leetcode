class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minimumAbs = Integer.MAX_VALUE;
        
        Arrays.sort(arr);

        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1] - arr[i];

            if (temp <= minimumAbs) {
                List<Integer> list = new ArrayList<>();

                list.add(arr[i]);
                list.add(arr[i + 1]);

                if (temp < minimumAbs) {
                    answer.clear();
                    minimumAbs = temp;
                }

                answer.add(list);
            }
        }

        return answer;
    }
}