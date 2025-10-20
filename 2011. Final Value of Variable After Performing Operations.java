class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String o : operations) {
            switch (o.toCharArray()[1]) {
                case '+':
                    result++;
                    break;
                case '-':
                    result--;
                    break;
            }
        }

        return result;
    }
}