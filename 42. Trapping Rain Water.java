class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        int leftIndex = 0;
        int rightIndex = height.length - 1;
        
        int count = 0;

        while (leftIndex < rightIndex) {
            if (maxLeft <= maxRight) {
                count += maxLeft - height[leftIndex];
                leftIndex++;
                maxLeft = Math.max(maxLeft, height[leftIndex]);
            } else {
                count += maxRight - height[rightIndex];
                rightIndex--;
                maxRight = Math.max(maxRight, height[rightIndex]);
            }
        }

        return count;
    }
}