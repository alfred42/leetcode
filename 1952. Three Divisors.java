class Solution {
    public boolean isThree(int n) {
        if (n == 1 || n == 2) return false;

        boolean flag = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                if (flag) {
                    return false;
                } else {
                    flag = true;
                }
            }
        }

        return flag == true;
    }
}