class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int answer = 0;

        int[] sum = new int[1001];

        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (Math.abs(arr[j] - arr[k]) <= b) {
                    int leftJ = arr[j] - a;
                int rightJ = arr[j] + a;
                int leftK = arr[k] - c;
                int rightK = arr[k] + c;

                int l = Math.max(0, Math.max(leftJ, leftK));
                int r = Math.min(1000, Math.min(rightJ, rightK));

                if (l <= r) {
                    if (l == 0) {
                        answer += sum[r];
                    } else {
                        answer += sum[r] - sum[l - 1];
                    }
                }
                }
            }




            for (int k = arr[j]; k <= 1000; k++) {
                sum[k]++;
            }
        }

        return answer;
    }
}