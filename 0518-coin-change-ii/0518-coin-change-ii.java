class Solution {
    public int change(int amount, int[] coins) {
       int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return solve(0, amount, coins, dp);
    }

     public int solve(int i, int amount, int[] coins, int[][] dp) {
        if (amount == 0) return 1;
        if (i == coins.length) return 0;

        if (dp[i][amount] != -1) return dp[i][amount];

        int notTake = solve(i + 1, amount, coins, dp);

        int take = 0;
        if (coins[i] <= amount) {
            take = solve(i, amount - coins[i], coins, dp);
        }

        return dp[i][amount] = take + notTake;
    }
}