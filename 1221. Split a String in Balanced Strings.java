class Solution {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();

        int index = 0;
        int count = 0;
        int answer = 0;

        while (index < s.length()) {
            if (arr[index] == 'R') count++;
            else count--;

            index++;

            if (count == 0) answer++;
        }

        return answer;
    }
}