
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int res = solve(0, amount, coins, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int solve(int i, int amount, int[] coins, int[][] dp) {
        if (amount == 0) return 0;
        if (i == coins.length) return Integer.MAX_VALUE;

        if (dp[i][amount] != -1) return dp[i][amount];

        int notTake = solve(i + 1, amount, coins, dp);

        int take = Integer.MAX_VALUE;
        if (coins[i] <= amount) {
            int next = solve(i, amount - coins[i], coins, dp);
            if (next != Integer.MAX_VALUE)
                take = 1 + next;
        }

        return dp[i][amount] = Math.min(take, notTake);
    }
}