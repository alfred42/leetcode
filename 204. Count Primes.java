class Solution {
    public int countPrimes(int n) {

        boolean[] arr = new boolean[n];

        Arrays.fill(arr, true);

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                count++;

                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        arr[j] = false;
                    }
                }
            }
        }

        return count;
    }
}