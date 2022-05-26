class Solution {
    public boolean divideArray(int[] nums) {
        boolean[] array = new boolean[500];

        for (int num : nums) {
            array[num - 1] = !array[num - 1];
        } 

        for (boolean b : array) {
            if (b) {
                return false;
            }
        }

        return true;
    }
}