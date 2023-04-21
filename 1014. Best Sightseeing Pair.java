class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int answer = 0;

        int maxI = values[0] + 0;

        for (int j = 1; j < values.length; j++) {
            answer = Math.max(answer, maxI + values[j] - j);
            maxI = Math.max(maxI, values[j] + j);
        }

        return answer;
    }
}