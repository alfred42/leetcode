class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 0;
        for (String str : sentence.split(" ")) {
            if (str.indexOf(searchWord) == 0) {
                return index + 1;
            }
            index++;
        }

        return -1;
    }
}