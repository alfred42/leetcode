class Solution {
    public int longestBalanced(String s) {
        int answer = 0;

        for (int i = 0; i < s.length();i++) {
            int[] count = new int[26];

            int unique = 0;
            int maxCount = 0;

            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                count[index]++;

                if (count[index] == 1) unique++;

                if (count[index] > maxCount) maxCount = count[index];

                int currentLength = j - i + 1;
                if (maxCount * unique == currentLength) {
                    answer = Math.max(answer, currentLength);
                }
            }
        }

        return answer;
    }
}