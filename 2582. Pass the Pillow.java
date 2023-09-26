class Solution {
    public int passThePillow(int n, int time) {
        time = time % (2 * n - 2);
        System.out.println(time);

        return time >= n ? 2 * n - 1 - time : time + 1;
    }
}