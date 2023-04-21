class Solution {
    public int[] frequencySort(int[] nums) {
        int[] counts = new int[201];

        for (int num : nums) {
            counts[num + 100]++;
        }

        int[] answer = new int[nums.length];

        int index = 0;

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 200; j >= 0; j--) {
                if (counts[j] == i) {
                    while (counts[j] > 0) {
                        answer[index++] = j - 100;
                        counts[j]--;
                    }
                }
            }
        }

        return answer;
    }
}