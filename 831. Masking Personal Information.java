class Solution {
    public String maskPII(String s) {
        StringBuilder sb = new StringBuilder();

        if (s.contains("@")) {
            sb.append(s.charAt(0));
            sb.append("*****");
            sb.append(s.substring(s.indexOf("@") - 1));
            return sb.toString().toLowerCase();
        } else {
            String rawDigits = s.replaceAll("\\D+", "");
            sb.append("***-***-" + rawDigits.substring(rawDigits.length() - 4));
            if (rawDigits.length() > 10) {
                sb.insert(0, "-");
                for (int i = 0; i < rawDigits.length() - 10; i++) {
                    sb.insert(0, "*");
                }
                sb.insert(0, "+");
            }
            return sb.toString();
        }
    }
}