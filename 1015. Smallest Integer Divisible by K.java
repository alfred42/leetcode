class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int count = 1;

        int currentNumber = 1;

        while(true){
            if(currentNumber % k == 0) return count;
            count++;
            currentNumber = (currentNumber % k) * 10 + 1;
        }
    }
}