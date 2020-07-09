class Solution {
    public List<Integer> transformArray(int[] arr) {
        boolean done = false;

        while (!done) {
            done = true;

            int[] temp = new int[arr.length];

            temp[0] = arr[0];
            temp[temp.length - 1] = arr[arr.length - 1];

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    temp[i] = arr[i] - 1;
                    done = false;
                } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    temp[i] = arr[i] + 1;
                    done = false;
                } else {
                    temp[i] = arr[i];
                }
            }

            arr = temp;
        }

        List<Integer> result = new ArrayList<>();

        for (int i : arr) {
            result.add(i);
        }

        return result;
    }
}