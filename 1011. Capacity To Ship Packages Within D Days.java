class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right = 0;
        int left = Integer.MIN_VALUE;

        for (int weight : weights) {
            right += weight;
            left = Math.max(left, weight);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int currentWeight = 0;
            int currentCount = 1;

            for (int weight : weights) {
                if (currentWeight + weight > mid) {
                    currentCount++;

                    if (currentCount > days) {
                        break;
                    }

                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }

            if (currentCount > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;       
    }
}