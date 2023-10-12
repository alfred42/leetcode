class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long answer = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (left == right) {
                answer += nums[left];
                break;
            } else {
                int temp = nums[left];

                for (char c : String.valueOf(nums[right]).toCharArray()) {
                    temp = temp * 10 + (c - '0');
                }

                answer += temp;

                left++;
                right--;
            }

        } 

        return answer;
    }
}