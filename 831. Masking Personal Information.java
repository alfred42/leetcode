class Solution {
    public String maskPII(String S) {

        if (S.contains("@")) {
            S = S.toLowerCase();

            int atIndex = S.indexOf("@");

            StringBuilder sb = new StringBuilder();
            sb.append(S.charAt(0)).append("*****").append(S.charAt(atIndex - 1)).append(S.substring(atIndex));

            return sb.toString();
        } else {
            S = S.replace("(", "").replace(")", "").replace(" ", "").replace("+", "").replace("-", "");

            if (S.length() == 10) return "***-***-" + S.substring(S.length() - 4);
            else {
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                for (int i = 0; i < S.length() - 10; i++) {
                    sb.append("*");
                }
                sb.append("-***-***-");

                sb.append(S.substring(S.length() - 4));
                return sb.toString();
            }
        }
    }
}