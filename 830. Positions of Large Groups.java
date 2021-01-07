class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        if (s == null || s.length() == 0) return result;

        char[] charArray = s.toCharArray();

        int currentStartIndex = 0;
        char currentChar = charArray[0];

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] != currentChar) {
                if (i - currentStartIndex >= 3) {
                    result.add(Arrays.asList(new Integer[] {currentStartIndex, i - 1}));
                }

                currentStartIndex = i;
                currentChar = charArray[i];
            }
        }

        if (charArray.length - currentStartIndex >= 3) {
            result.add(Arrays.asList(new Integer[] {currentStartIndex, charArray.length - 1}));
        }

        return result;
    }
}