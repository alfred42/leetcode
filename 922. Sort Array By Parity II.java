class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int oddIndex = 0; 
        int evenIndex = 1;

        while (oddIndex < A.length && evenIndex < A.length) {
            while (oddIndex < A.length && A[oddIndex] % 2 == 0) oddIndex += 2;
            while (evenIndex < A.length && A[evenIndex] % 2 == 1) evenIndex += 2;

            if (oddIndex < A.length && evenIndex < A.length) {
                int temp = A[oddIndex];
                A[oddIndex] = A[evenIndex];
                A[evenIndex] = temp;
            }
        }

        return A;
    }
}