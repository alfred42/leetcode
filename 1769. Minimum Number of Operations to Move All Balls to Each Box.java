class Solution {
    public int[] minOperations(String boxes) {
        int left = boxes.charAt(0) == '1' ? 1 : 0;
        int right = 0;
        int operations = 0;

        for (int i = 1; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                operations += i;
                right++;
            }
        }

        int[] result = new int[boxes.length()];
        result[0] = operations;

        for (int i = 1; i < boxes.length(); i++) {
            operations = operations + left - right;

            if (boxes.charAt(i) == '1') {
                left++;
                right--;
            }

            result[i] = operations;
        }

        return result;
    }
}