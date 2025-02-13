class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] counter = new int[46];

        int maxCount = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int index = 0;

            int d = i;

            while (d != 0) {
                index += d % 10;
                d /= 10;
            }

            counter[index] += 1;

            maxCount = Math.max(maxCount, counter[index]);
        }

        return maxCount;
    }
}