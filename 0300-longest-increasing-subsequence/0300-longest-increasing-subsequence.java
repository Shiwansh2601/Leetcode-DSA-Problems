import java.util.*;

class Solution {

    int[] nums;
    int[][] memo;

    public int lengthOfLIS(int[] nums) {

        this.nums = nums;

        int n = nums.length;

        // prev = -1 is represented using n
        memo = new int[n][n + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(0, n);
    }

    private int solve(int i, int prev) {

        if (i == nums.length) {
            return 0;
        }

        if (memo[i][prev] != -1) {
            return memo[i][prev];
        }

        // Skip current element
        int skip = solve(i + 1, prev);

        // Take current element
        int take = 0;

        if (
            prev == nums.length ||
            nums[i] > nums[prev]
        ) {

            take =
                1 + solve(i + 1, i);
        }

        return memo[i][prev] =
            Math.max(take, skip);
    }
}