class Solution {
    public int findSpecialInteger(int[] arr) {
        int span = arr.length / 4 + 1;

        for (int i = 0; i < arr.length; i += span) {
            int start = binarySearch(arr, arr[i]);
            int end = binarySearch(arr, arr[i] + 1);

            if (end - start >= span) {
                return arr[i];
            }
        }

        return -1;
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int res = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}