class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] counter = new int[1000];

        for (int t : target) {
            counter[t - 1]++;
        }

        for (int a : arr) {
            counter[a - 1]--;
            if (counter[a - 1] < 0) {
                return false;
            }
        }

        return true;
    }
}