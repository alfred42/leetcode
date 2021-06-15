class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (rightIndex != leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            if (arr[mid] > arr[mid + 1]) {
                rightIndex = mid;
            } else {
                leftIndex = mid + 1;
            }
        }
        
        return leftIndex;
    }
}