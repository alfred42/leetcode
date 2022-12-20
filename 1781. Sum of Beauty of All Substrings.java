class Solution {
    public int beautySum(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            int maxFrequency = 0;

            for (int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'a']++;
                maxFrequency = Math.max(maxFrequency, count[s.charAt(j) - 'a']);

                int minFrequency = s.length();

                for (int k = 0; k < count.length; k++) {
                    if (count[k] > 0) {
                        minFrequency = Math.min(count[k], minFrequency);
                    }
                }

                answer += maxFrequency - minFrequency;
            }
        }

        return answer;
    }
}