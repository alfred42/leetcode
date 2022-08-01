class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] counts = new int[60];

        for (int i = 0; i < time.length; i++) {
            counts[time[i] % 60]++;
        }

        long answer = (long)counts[0] * (long)(counts[0] - 1) / 2 + (long)counts[30] * (long)(counts[30] - 1) / 2;

        for (int i = 1; i < 30; i++) {
            answer += counts[i] * counts[60 - i];
        }
    
        return (int) answer;
    }
}