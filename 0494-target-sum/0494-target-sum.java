class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int total = 0;

        for (int x : nums) {
            total += x;
        }

        // Target impossible
        if (Math.abs(target) > total) {
            return 0;
        }

        int subsetSum = target + total;

        // Cannot divide into two equal integer sums
        if (subsetSum % 2 != 0) {
            return 0;
        }

        subsetSum /= 2;

        int n = nums.length;

        int[][] dp = new int[n + 1][subsetSum + 1];

        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return countSubsets(nums, n, subsetSum, dp);
    }

    public int countSubsets(int[] nums, int n, int sum, int[][] dp) {

        // Base case
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }

        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }

        // Don't take nums[n-1]
        int notTake = countSubsets(nums, n - 1, sum, dp);

        int take = 0;

        // Take nums[n-1]
        if (nums[n - 1] <= sum) {
            take = countSubsets(
                nums,
                n - 1,
                sum - nums[n - 1],
                dp
            );
        }

        return dp[n][sum] = take + notTake;
    }
}