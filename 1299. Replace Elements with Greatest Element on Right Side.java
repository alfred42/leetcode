class Solution {
    public int[] replaceElements(int[] arr) {
        int[] answer = new int[arr.length];

        answer[arr.length - 1] = -1;

        int currentMax = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            currentMax = Math.max(currentMax, arr[i + 1]);
            answer[i] = currentMax;
        }

        return answer;
    }
}