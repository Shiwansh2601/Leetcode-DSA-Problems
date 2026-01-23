class Solution {

    // Tabulation DP
    public boolean canPartition(int[] nums) {
        return solve(nums);
    }

    public boolean solve(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0)
            return false;
        else {
            boolean[][] dp = new boolean[arr.length + 1][sum / 2 + 1];
            for (int i = 0; i <= arr.length; i++) {
                for (int j = 0; j <= sum / 2; j++) { // initilization
                    if (j > 0 && i == 0)
                        dp[i][j] = false;

                    if (j == 0)
                        dp[i][j] = true;
                }
            }

            return subsetsum(arr, arr.length, sum / 2, dp);
        }

    }

    public boolean subsetsum(int arr[], int n, int sum, boolean[][] dp) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];

            }
        }

        return dp[n][sum];
    }
}