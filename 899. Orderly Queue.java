class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            StringBuilder sb = new StringBuilder(s);

            String minString = s;

            for (int i = 1; i < s.length(); i++) {
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);

                if (sb.toString().compareTo(minString) < 0) {
                    minString = sb.toString();
                }
            }

            return minString;
        } else {
            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            return new String(chars);
        }
    }
}