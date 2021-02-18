class Solution {
    public int minOperations(String s) {
        if (s == null || s.length() == 0) return 0;

        char[] arr = s.toCharArray();
        
        int count0Change = 0;
        int count1Change = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] == '0') {
                    count1Change++;
                } else {
                    count0Change++;
                }
            } else {
                if (arr[i] == '0') {
                    count0Change++;
                } else {
                    count1Change++;
                }
            }
        }

        return Math.min(count0Change, count1Change);
    }
}