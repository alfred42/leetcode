class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int miles = 0;
        int toAdd = 5;

        while (mainTank != 0) {
            miles += 10;
            mainTank--;
            toAdd--;

            if (toAdd == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
                toAdd = 5;
            }
        }

        return miles;
    }
}