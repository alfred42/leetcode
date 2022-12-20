class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append((int)(c - 'a') + 1);
        }

        String temp = sb.toString();

        while (k > 0) {
            int sum = 0;

            for (char c : temp.toCharArray()) {
                sum +=(int)(c - '0');
            }

            temp = String.valueOf(sum);

            k--;
        }

        return Integer.valueOf(temp);
    }
}