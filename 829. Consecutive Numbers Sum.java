class Solution {
    public int consecutiveNumbersSum(int N) {
        int leftIndex = 1;
        int rightIndex = 1;

        int sum = 1;
        int count = 0;

        while (true) {
            if (sum == N) {
                count++;
                rightIndex++;
            } else if (sum > N) {
                sum -= leftIndex;
                leftIndex++;
            } else {
                rightIndex++;
                sum += rightIndex;
            }
        }

        return count;
    }
}