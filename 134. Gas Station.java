class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;

        while (i < gas.length) {
            int totalGas = 0;
            int totalCost = 0;

            int count = 0;
            while (count < gas.length) {
                totalGas += gas[(i + count) % gas.length];
                totalCost += cost[(i + count) % cost.length];

                if (totalGas < totalCost) {
                    break;
                }

                count++;
            }

            if (count == gas.length) {
                return i;
            }

            i = i + count + 1;    
        }

        return -1;
    }
}