class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] dp = new int[words.length + 1];
        int[] answer = new int[queries.length];

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (ifValid(words[i])) count++;

            dp[i + 1] = count;
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = dp[queries[i][1] + 1] - dp[queries[i][0]];
        }


        return answer;
    }

    public boolean ifValid(String word) {
        return (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') && 
        (word.charAt(word.length() - 1) == 'a' || word.charAt(word.length() - 1) == 'e' || word.charAt(word.length() - 1) == 'i' || word.charAt(word.length() - 1) == 'o' || word.charAt(word.length() - 1) == 'u');
    }
}