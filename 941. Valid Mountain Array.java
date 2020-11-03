class Solution {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length <= 2) return false;
        int index = 1;
        
        if (A[1] <= A[0]) return false;

        for (;index < A.length;index++) {
            if (A[index] == A[index - 1]) return false;
            if (A[index] < A[index - 1]) break;
        }

        if (index == A.length) return false;

        while (index < A.length) {
            if (A[index] >= A[index - 1]) return false;
            index++;
        }

        return true;
    }
}