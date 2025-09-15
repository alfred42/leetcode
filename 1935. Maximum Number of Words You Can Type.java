class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int answer = 0;

        for (String word : text.split(" ")) {
            boolean noBroken = true;
            for (char c : brokenLetters.toCharArray()) {
                if (word.contains(String.valueOf(c))) {
                    noBroken = false;
                    break;
                }
            }

            if (noBroken) answer++;
        }

        return answer;
    }
}