class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] array = new int[26];

        for (char c : tasks) {
            array[c - 'A']++;
        }

        Arrays.sort(array);

        int time = 0;

        while (array[25] > 0) {
            int i = 0;

            while (i <= n) {
                if (array[25] == 0) break;
                if (i < 26 && array[25 - i] > 0) {
                    array[25 - i]--;
                }
                time++;
                i++;
            }

            Arrays.sort(array);
        }

        return time;
    }
}