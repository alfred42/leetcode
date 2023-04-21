class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

        String[] words = text.trim().split("\\s+");

        if (words.length == 1) {
            sb.append(words[0]);

            while (spaceCount > 0) {
                sb.append(" ");
                spaceCount--;
            }

            return sb.toString();
        }

        int spaceEach = spaceCount / (words.length - 1);

        for (String word : words) {
            sb.append(word);
            
            if (spaceCount >= spaceEach) {
                for (int i = spaceEach; i > 0 ; i--) {
                    sb.append(' ');
                }
                spaceCount -= spaceEach;
            }
        }

        while (spaceCount > 0) {
            sb.append(' ');
            spaceCount--;
        }

        return sb.toString();
    }
}