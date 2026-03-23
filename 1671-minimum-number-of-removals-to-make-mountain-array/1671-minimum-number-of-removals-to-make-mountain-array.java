class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);

        LIS(nums, dp);
        LDS(nums, dp2);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] > 1 && dp2[i] > 1) {
                if (dp[i] > 1 && dp2[i] > 1) {
                    int lr = (i + 1) - dp[i];
                    int rr = (n - i) - dp2[i];
                    ans = Math.min(ans, lr + rr);
                }
            }
        }
        return ans;
    }

    public void LIS(int[] nums, int[] dp) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
    }

    public void LDS(int[] nums, int[] dp) {
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
    }
}