class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> answer = new ArrayList<>();
        
        letterCasePermutation(S, 0, answer, "");
        
        return answer;
    }
    
    public void letterCasePermutation(String s, int startIndex, List<String> result, String prefix) {
        if (prefix.length() == s.length()) result.add(prefix);
        
        else if (s.charAt(startIndex) >= 'a' && s.charAt(startIndex) <= 'z') {
            letterCasePermutation(s, startIndex + 1, result, prefix + s.charAt(startIndex));
            letterCasePermutation(s, startIndex + 1, result, prefix + Character.toUpperCase(s.charAt(startIndex)));
        } else if (s.charAt(startIndex) >= 'A' && s.charAt(startIndex) <= 'Z') {
            letterCasePermutation(s, startIndex + 1, result, prefix + s.charAt(startIndex));
            letterCasePermutation(s, startIndex + 1, result, prefix + Character.toLowerCase(s.charAt(startIndex)));
        } else {
            letterCasePermutation(s, startIndex + 1, result, prefix + s.charAt(startIndex));
        }
    }
}