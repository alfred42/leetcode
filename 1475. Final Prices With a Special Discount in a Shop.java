class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i] = prices[i] - stack.peek();
            } else {
                answer[i] = prices[i];
            }

            stack.push(prices[i]);
        }

        return answer;
    }
}