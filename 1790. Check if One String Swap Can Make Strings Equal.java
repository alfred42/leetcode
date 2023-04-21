class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        boolean hit = false;

        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) != s2.charAt(index)) {

                if (hit) return false; 

                hit = true;

                char c1 = s1.charAt(index);
                char c2 = s2.charAt(index);
                
                index++;

                while (index < s1.length()) {
                    if (s1.charAt(index) != s2.charAt(index)) {
                        if (c1 != s2.charAt(index) || c2 != s1.charAt(index)) return false;
                        else {
                            break;
                        }
                    }
                    index++;
                }

                if (index == s1.length()) return false;
            }
        }

        return true;
    }
}