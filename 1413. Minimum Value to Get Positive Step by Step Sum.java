class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minValue = 0;

        for (int num : nums) {
            sum += num;
            minValue = Math.min(minValue, sum);
        }

        int answer = - minValue + 1;
        if (answer < 1) return 1;
        else return answer; 

    }
}