public class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

 public List<String> letterCombinations(String digits) {
     List<String> result = new ArrayList<String>();
     
     if (digits.length() != 0) letterCombinations("", digits, 0, result);
     
     return result;
 }
 
 public void letterCombinations(String prefix, String digits, int startIndex, List<String> result) {
     if (startIndex == digits.length()) {
         result.add(prefix);
     } else {
         for (char c : KEYS[digits.charAt(startIndex) - '0'].toCharArray()) {
             letterCombinations(prefix + c, digits, startIndex + 1, result);
         }
     }
 }
}