class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;

        List<StringBuilder> sbList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }

        int i = 0; int flag = -1;

        for (char c : s.toCharArray()) {
            sbList.get(i).append(c);

            if (i == 0 || i == sbList.size() - 1) {
                flag = - flag;
            }

            i += flag;
        }

        StringBuilder resultSb = new StringBuilder();

        for (StringBuilder sb :  sbList) {
            resultSb.append(sb);
        }

        return resultSb.toString();
    }
}