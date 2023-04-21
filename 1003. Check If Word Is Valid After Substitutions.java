class Solution {
    public boolean isValid(String s) {
        if (s == null) return false;

        while (true) {
            if (s.contains("abc")) {
                s = s.replace("abc", "");
            } else {
                return s.length() == 0;
            }
        }
    }
}