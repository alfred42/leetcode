class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        int currentProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (currentProfit + prices[i] - prices[i - 1] <= 0) {
                currentProfit = 0;
            } else {
                currentProfit = currentProfit + prices[i] - prices[i - 1];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        
        return maxProfit;
    }
}