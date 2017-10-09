class Solution {
    private List<String> result = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        generateParenthesisHelper(n, 0, 0, "");
        return result;
    }
    
    public void generateParenthesisHelper(int n, int left, int right, String prefix) {
        if (prefix.length() == n * 2) {
            result.add(prefix);
            return;
        }
        
        if (left < n) {
            generateParenthesisHelper(n, left + 1, right, prefix + "(");
        }
        if (left > right) {
            generateParenthesisHelper(n, left, right + 1, prefix + ")");
        }
         
    }
}