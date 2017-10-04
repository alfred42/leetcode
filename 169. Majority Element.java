class Solution {
    public int majorityElement(int[] nums) {
        int currentElement = nums[0];
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                currentElement = nums[i];
            } else {
                if (currentElement == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        return currentElement;
    }
}