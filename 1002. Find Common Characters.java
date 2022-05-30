class Solution {
    public List<String> commonChars(String[] words) {
        int[] minCounts = new int[26];

        Arrays.fill(minCounts, Integer.MAX_VALUE);

        for (String word : words) {
            int[] counts = new int[26];

            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }

            for (int i = 0; i < counts.length; i++) {
                minCounts[i] = Math.min(minCounts[i], counts[i]);
            }
        }

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < minCounts.length; i++) {
            while (minCounts[i] > 0) {
                resultList.add(Character.toString((char)('a' + i)));
                minCounts[i]--;
            }
        }

        return resultList;
    }
}