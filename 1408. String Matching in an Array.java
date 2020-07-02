class Solution {
    public List<String> stringMatching(String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            sb.append(",");
        }

        String result = sb.toString();

        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (result.indexOf(word) != result.lastIndexOf(word)) list.add(word);
        }

        return list;
    }
}