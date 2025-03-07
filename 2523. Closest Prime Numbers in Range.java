class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];

        Arrays.fill(isPrime, true);
        
        if (isPrime.length > 0) isPrime[0] = false;
        if (isPrime.length > 1) isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        
        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1) {
                    int diff = i - prev;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result[0] = prev;
                        result[1] = i;
                    }
                }
                prev = i;
            }
        }
        
        return result[0] == -1 ? new int[] {-1, -1} : result;
    }
}