class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0], i);
        }
 
        int index = 0;

        while (index < arr.length) {
            if (map.containsKey(arr[index])) {
                int[] temp = pieces[map.get(arr[index])];

                for (int j : temp) {
                    if (arr[index++] != j) return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}