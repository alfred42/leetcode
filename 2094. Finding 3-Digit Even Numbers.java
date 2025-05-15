class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        List<Integer> result = new ArrayList<>();

        for (int d : digits) {
            count[d]++;
        }

        for (int i = 100; i < 1000; i++) {
            if (i % 2 != 0) continue;

            int[] tempCount = new int[10];

            int j = i;

            boolean valid = true;

            while (j > 0) {
                int t = j % 10;
                tempCount[t]++;

                if (tempCount[t] > count[t]) {
                    valid = false;
                    break;
                } 

                j /= 10;
            } 

            if (valid) {
                result.add(i);
            }
        }

        int[] output = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}