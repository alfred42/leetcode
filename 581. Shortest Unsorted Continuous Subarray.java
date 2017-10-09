class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        
        int leftIndex = 1;
        int rightIndex= nums.length - 2;
        
        int min = 0;
        int max = 0;
        
        boolean flag = false;
        while (leftIndex < nums.length) {
            if (!flag) {
                if (nums[leftIndex - 1] <= nums[leftIndex]) {
                    leftIndex++;  
                } else {
                    flag = true;
                    min = nums[leftIndex];
                }
            } else {
                min = Math.min(min, nums[leftIndex]);
                leftIndex++;  
            }
        }
        
        if (!flag) return 0;
        
        flag = false;
        
        while (rightIndex >= 0) {
            if (!flag) {
                if (nums[rightIndex] <= nums[rightIndex + 1]) {
                rightIndex--;
                } else {
                    max = nums[rightIndex];
                    flag = true;
                }
            } else {
                max = Math.max(max, nums[rightIndex]);
                rightIndex--;
            }
        }
        
        System.out.println(min + " " + max);
        
        leftIndex = 0;
        rightIndex = nums.length - 1;
        
        while (leftIndex < nums.length && nums[leftIndex] <= min) {
            leftIndex++;
        }
        
        while ( rightIndex > 0 && nums[rightIndex] >= max) {
            rightIndex--;
            System.out.println(rightIndex);
        }
        
        System.out.println(leftIndex + " " + rightIndex);
        return rightIndex - leftIndex + 1;
        
    }
}