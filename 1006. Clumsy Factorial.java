class Solution {
    public int clumsy(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 6;

        int answer = n * (n - 1) / (n - 2);
        n -= 3;

        while (n > 0) {
            if (n > 0) {
                answer += n;
                n--;
            }

            if (n > 0) {
                int temp = n;
                n--;

                if (n > 0) {
                    temp *= n;
                    n--;
                }

                if (n > 0) {
                    temp /= n;
                    n--;
                }

                answer -= temp;
            }
        }

        return answer;
    }
}