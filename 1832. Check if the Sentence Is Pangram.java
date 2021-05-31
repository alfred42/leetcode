class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];

        for (char c : sentence.toCharArray()) {
            arr[c - 'a'] = true;
        }

        for (boolean b : arr) {
            if (!b) return false;
        }

        return true;
    }
}