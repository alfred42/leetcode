class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] chars = new boolean[26];

        for (char c : sentence.toCharArray()) {
            chars[c - 'a'] = true;
        }

        for (boolean b : chars) {
            if (!b) return false;
        }

        return true;
    }
}