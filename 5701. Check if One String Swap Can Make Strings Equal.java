class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }

        if ((s1 == null || s2 == null) || s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }

        int diffCount = 0;
        int[] wordCount = new int[256];

        char c1 = '0';
        char c2 = '0';

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;

                if (diffCount > 2) {
                    return false;
                }
                else if (diffCount == 1) {
                    c1 = s1.charAt(i);
                    c2 = s2.charAt(i);
                } else {
                    if (c1 != s2.charAt(i) || c2 != s1.charAt(i)) {
                        return false;
                    }
                }
            }
        }

        return diffCount == 0 || diffCount == 2;
    }
}