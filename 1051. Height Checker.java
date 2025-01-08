class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = new int[heights.length];

        System.arraycopy(heights, 0, copy, 0, heights.length);

        Arrays.sort(copy);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }

        return count;
    }
}