class Solution {
    public int hammingDistance(int x, int y) {
        int s = x ^ y;
        int sum = 0;

        while (s != 0) {
            sum++;
            s &= s - 1;
        }

        return sum;
    }
}