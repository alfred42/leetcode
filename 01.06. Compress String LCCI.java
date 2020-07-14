class Solution {
    public String compressString(String S) {
        if (S == null) return null;
        if (S.length() == 0) return S;

        StringBuilder sb = new StringBuilder();

        char[] arr = S.toCharArray();

        char currentChar =' ';
        int currentCount = 0;

        for (char c : arr) {
            if (c != currentChar) {
                if (currentCount != 0) {
                    sb.append(currentChar);
                    sb.append(String.valueOf(currentCount));
                }
                
                currentChar = c;
                currentCount = 1;
            } else {
                currentCount++;
            }
        }

        if (currentCount != 0) {
            sb.append(currentChar);
            sb.append(String.valueOf(currentCount));
        }

        if (sb.toString().length() >= S.length()) return S;

        return sb.toString();
    }
}