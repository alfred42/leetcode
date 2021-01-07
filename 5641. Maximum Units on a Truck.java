class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (boxA, boxB) -> {return boxB[1] - boxA[1];});

        int count = 0;
        int index = 0;

        while (truckSize > 0 && index < boxTypes.length) {
            int boxCount = boxTypes[index][0];
            int boxUnit = boxTypes[index][1];
            while (truckSize > 0 && boxCount > 0) {
                count += boxUnit;
                boxCount--;
                truckSize--;
            }

            index++;
        }

        return count;

    }
}