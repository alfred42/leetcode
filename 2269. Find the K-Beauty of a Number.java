class Solution {
    public int divisorSubstrings(int num, int k) {
        int answer = 0;

        String numString = String.valueOf(num);
        char[] charArray = numString.toCharArray();

        for (int i = 0; i + k - 1 < charArray.length; i++) {
            int tempSum = 0;

            for (int j = i; j < i + k; j++) {
                tempSum = tempSum * 10 + Character.getNumericValue(charArray[j]);
            }

            if (tempSum != 0 && num % tempSum == 0) answer++;
        }

        return answer;
    }
}