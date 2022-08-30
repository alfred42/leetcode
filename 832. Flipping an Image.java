class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image.length + 1) / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length - j - 1] == 0? 1: 0;
                image[i][image.length - j - 1] = temp == 0? 1: 0;
            }
        }
        
        return image;
    }
}