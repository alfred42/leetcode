class Solution {
    public int countPrimeSetBits(int L, int R) {
        int answer = 0;
        
        for (int i = L; i <= R; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                if (temp % 2 != 0) count++;
                temp /= 2;
            }
            
            
            if (isPrime(count)) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(int count) {
        if (count == 0 || count == 1) return false;
        for (int i = 2; i < count; i++) {
            if (count % i == 0) return false;
        }
        
        return true;
    }
}