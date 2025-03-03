class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lessCount = 0;
        int greaterCount = 0;

        for (int num : nums) {
            if (num > pivot) greaterCount++;
            if (num < pivot) lessCount++;
        }

        int[] answer = new int[nums.length];
        int left = 0;
        int right = nums.length - greaterCount;

        for (int num : nums) {
            if (num < pivot) {
                answer[left++] = num; 
            } else if (num > pivot) {
                answer[right++] = num;
            }
        }

        for (int i = lessCount; i < nums.length - greaterCount; i++) {
            answer[i] = pivot;
        }

        return answer;
    }
}