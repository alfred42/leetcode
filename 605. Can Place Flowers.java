class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = -1;
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }

        if (prev < 0) {
            count += (flowerbed.length + 1) / 2;
        } else {
            count += (flowerbed.length - prev - 1) / 2;
        }

        return count >= n;
    }
}