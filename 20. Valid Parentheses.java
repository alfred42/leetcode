class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0) return false;
                char t = stack.pop();
                if (c == ')' && t != '(') {
                    return false;
                } else if (c == '}' && t != '{') {
                    return false;
                } else if (c ==']' && t != '[' ) {
                    return false;
                }
            }
        }
        
        return stack.size() == 0;
    }
}