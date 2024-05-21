class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }

        Map<Character, String[]> map = new HashMap<>();

        map.put('2', new String[] {"a", "b", "c"});
        map.put('3', new String[] {"d", "e", "f"});
        map.put('4', new String[] {"g", "h", "i"});
        map.put('5', new String[] {"j", "k", "l"});
        map.put('6', new String[] {"m", "n", "o"});
        map.put('7', new String[] {"p", "q", "r", "s"});
        map.put('8', new String[] {"t", "u", "v"});
        map.put('9', new String[] {"w", "x", "y", "z"});

        List<String> result = new ArrayList<String>();

        backTrack(result, map, digits, 0, new StringBuilder());

        return result;
    }

    private void backTrack(List<String> result, Map<Character, String[]> map, String digits, int currentIndex, StringBuilder sb) {
        if (currentIndex == digits.length()) {
            result.add(sb.toString());
        } else {
            char digit = digits.charAt(currentIndex);
            String[] tempStrings = map.get(digit);

            for (String str : tempStrings) {
                sb.append(str);
                backTrack(result, map, digits, currentIndex + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}