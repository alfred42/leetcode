class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) {
                maxPrime = Math.max(nums[i][i], maxPrime);
            }

            if (isPrime(nums[i][nums.length - 1 - i])) {
                maxPrime = Math.max(nums[i][nums.length - 1 - i], maxPrime);
            }
        }

        return maxPrime;
    }

    private boolean isPrime(int value) {
        if (value == 1) return false;

        int i = 2;

        while (i * i <= value) {
            if (value % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}