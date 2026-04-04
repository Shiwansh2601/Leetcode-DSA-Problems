class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n + 1][2];

        // dp[n][0] = dp[n][1] = 0 (already default)

        for (int i = n - 1; i >= 0; i--) {

            // buy = 0
            dp[i][0] = Math.max(
                prices[i] + dp[i + 1][1],  // sell
                dp[i + 1][0]               // skip
            );

            
            // buy = 1
            dp[i][1] = Math.max(
                -prices[i] + dp[i + 1][0],  // buy
                dp[i + 1][1]                // skip
            );

            
        }

        return dp[0][1];
    }

}