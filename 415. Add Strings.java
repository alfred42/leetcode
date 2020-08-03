class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int carry = 0;

        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        while (index1 >= 0 || index2 >= 0) {
            int i1 = index1 >= 0 ? (int)(num1.charAt(index1) - '0') : 0;
            int i2 = index2 >= 0 ? (int)(num2.charAt(index2) - '0') : 0;
            int temp = i1 + i2 + carry;
            carry = temp / 10;
            
            sb.insert(0, temp % 10);

            index1--;
            index2--;
        }

        if (carry == 1) sb.insert(0, 1);

        return sb.toString();

    }
}