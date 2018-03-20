class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null && B == null) return true;
        if (A == null || B == null) return false;
        
        if (A.length() != B.length()) return false;
        return (A + A).indexOf(B) >= 0;
    }
}