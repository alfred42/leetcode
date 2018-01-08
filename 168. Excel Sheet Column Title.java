class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n != 0) {
            int temp = n % 26;
            n /= 26;
            sb.insert(0, (char) (temp + 'A' - 1));    
        }
        
        return sb.toString();
    }
}