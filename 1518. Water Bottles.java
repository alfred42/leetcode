class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            numBottles--;
            totalBottles++;
            emptyBottles++;

            if (emptyBottles == numExchange) {
                emptyBottles = 0;
                numBottles++;
            }
        }

        return totalBottles;
    }
}