class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = lowLimit; i <= highLimit; i++) {
            int index = 0;
            int temp = i;

            while (temp > 0) {
                index += temp % 10;
                temp /= 10; 
            }

            int count = map.getOrDefault(index, 0) + 1;

            maxCount = Math.max(maxCount, count);
            map.put(index, count);
        }

        return maxCount;
    }
}