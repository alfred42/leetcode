class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();

        Arrays.sort(words, (stra, strb) -> stra.length() - strb.length());

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    answer.add(words[i]);
                    break;
                }
            }
        }

        return answer;
    }
}