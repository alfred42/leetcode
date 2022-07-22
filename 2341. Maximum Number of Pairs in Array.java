class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] counter = new int[101];
        
        for (int num : nums) {
            counter[num]++;
        }
        
        int pairs = 0;
        int remainCount = 0;
        for (int c : counter) {
            pairs += c / 2;
            remainCount += c % 2 == 0 ? 0 : 1;
        }
        
        return new int[] {pairs, remainCount};
    }
}