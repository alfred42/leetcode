class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int[] diff = new int[reward1.length];

        for (int i = 0; i < reward1.length; i++) {
            diff[i] = reward1[i] - reward2[i];
        }

        Arrays.sort(diff);

        int answer =  Arrays.stream(reward2).sum();

        while (k > 0) {
            answer += diff[diff.length - k];
            k--;
        }

        return answer;
    }
}