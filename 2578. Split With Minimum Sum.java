class Solution {
    public int splitNum(int num) {
        char[] digs = String.valueOf(num).toCharArray();
        Arrays.sort(digs);

        int num1 = 0;
        int num2 = 0;

        boolean flag = true;

        System.out.println(Arrays.toString(digs));

        for (int i = 0; i < digs.length; i++) {
            int v = digs[i] - '0';
            if (flag) {
                num1 = num1 * 10 + v;
            } else {
                num2 = num2 * 10 + v;
            }

            flag = !flag;
        }

        return num1 + num2;
    }
}