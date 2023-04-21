class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 3 != 0) return false;

        int targetSum = sum / 3;

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        
        int tempSum = 0;
        while (leftIndex < arr.length) {
            tempSum += arr[leftIndex];

            if (tempSum == targetSum) break;

            leftIndex++;
        }

        tempSum = 0;

        while (rightIndex >= 0) {
            tempSum += arr[rightIndex];

            if (tempSum == targetSum) break;

            rightIndex--;
        }

        return leftIndex < arr.length && rightIndex >= 0 && leftIndex < rightIndex && leftIndex + 1 != rightIndex;
    }
}