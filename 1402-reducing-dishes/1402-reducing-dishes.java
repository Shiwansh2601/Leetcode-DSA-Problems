
class Solution {
    int[][] dp;

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);   // VERY IMPORTANT
        int n = satisfaction.length;
        dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 1, satisfaction);
    }

    private int solve(int i, int time, int[] sat) {
        if (i == sat.length) {
            return 0;
        }

        if (dp[i][time] != -1) {
            return dp[i][time];
        }

        // Take the dish
        int take = sat[i] * time + solve(i + 1, time + 1, sat);

        // Skip the dish
        int skip = solve(i + 1, time, sat);

        return dp[i][time] = Math.max(take, skip);
    }
}
