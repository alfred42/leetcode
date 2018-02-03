class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        
        int[] dp = new int[triangle.size()];
        int[] temp = new int[triangle.size()];
        
        dp[0] = triangle.get(0).get(0);
        
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) temp[j] = dp[0] + triangle.get(i).get(0);
                else if (j == i) temp[j] = dp[j - 1] + triangle.get(i).get(j);
                else {
                    temp[j] = Math.min(dp[j - 1], dp[j]) + triangle.get(i).get(j);
                    System.out.println(dp[j - 1] + " " + dp[j] + " " + j);
                }
            }
            
            System.arraycopy(temp, 0, dp, 0, temp.length);
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int num : dp) {
            answer = Math.min(answer, num);
        }
        
        return answer;
    }
}