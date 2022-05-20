class Solution {
    public int findNumbers(int[] nums) {
        if (nums == null) return 0;

        int count = 0;

        for (int num : nums) {
            if (isEvenNumberOfDigits(num)) count++;
        }

        return count;
    }

    public boolean isEvenNumberOfDigits(int value) {
        if (value == 0) return false;
        
        int digits = 0;

        while (value > 0) {
            value /= 10;

            digits++;
        }

        return digits % 2 == 0;
    }
}