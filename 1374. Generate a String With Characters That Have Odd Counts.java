class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n == 1) return "a";

        if (n % 2 == 0) {
            while (n - 1 > 0) {
                sb.append("a");
                n--;
            }
            sb.append("b");
        } else {
            while (n - 2 > 0){
                sb.append("a");
                n--;
            }
            sb.append("b");
            sb.append("c");
        }

        return sb.toString();
    }
}