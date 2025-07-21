class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();

        char currentChar = charArray[0];
        sb.append(charArray[0]);
        int currentCount = 1;

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == currentChar) {
                currentCount++;

                if (currentCount == 2) {
                    sb.append(charArray[i]);
                }
            } else {
                sb.append(charArray[i]);
                currentCount = 1;
                currentChar = charArray[i];
            }
        }

        return sb.toString();
    }
}