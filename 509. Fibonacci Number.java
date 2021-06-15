class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        while (n - 1 > 0) {
            int temp = a + b;
            a = b;
            b = temp;
            
            n--;
        }

        return b;
    }
}