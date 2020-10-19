class Solution {
    public boolean backspaceCompare(String S, String T) {
        return scan(S).equals(scan(T));
    }

    public String scan(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#' && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}