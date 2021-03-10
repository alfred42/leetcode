class Solution {
    public boolean checkOnesSegment(String s) {
        if (s == null || s.length() <= 0) return false;

        char[] arr = s.toCharArray();
        boolean hit = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                while (i < arr.length && arr[i] == '1') {
                    i++;
                }

                while (i < arr.length) {
                    if (arr[i] == '1') {
                        return false;
                    }

                    i++;
                }
            }
        }

        return true;
    }
}