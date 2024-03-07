class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] answer = new int[word.length()];

        long current = 0;

        for (int i = 0; i < word.length(); i++) {
            current = (current * 10 + (word.charAt(i) - '0')) % m;
            answer[i] = current == 0? 1 : 0;
        }

        return answer;
    }
}