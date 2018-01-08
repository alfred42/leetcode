class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        boolean[] array = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = true;
        }
        
        array[0] = false;
        array[1] = false;
        for (int i = 2; i < n; i++) {
            if (array[i]) {
                for (int j = 2; i * j < n; j++) {
                    array[i * j] = false;
                }
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (array[i]) {
                count++;
            }
        }
        
        return count;
    }
}