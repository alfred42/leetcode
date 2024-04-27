class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalUnSatisfiedCount = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                totalUnSatisfiedCount += customers[i];
            }
        }

        int currentCovered = 0;

        for (int i = 0; i < minutes && i < customers.length; i++) {
            if (grumpy[i] == 1) currentCovered += customers[i];
        }

        int maxCovered = currentCovered;

        int i = 0;

        while (true) {
            if (grumpy[i] == 1) {
                currentCovered -= customers[i];
            }

            if (i + minutes == customers.length) break;

            if (grumpy[i + minutes] == 1) {
                currentCovered += customers[i + minutes];
            }

            maxCovered = Math.max(maxCovered, currentCovered);

            i++;
        }

        return Arrays.stream(customers).sum() - totalUnSatisfiedCount + maxCovered;
    }
}