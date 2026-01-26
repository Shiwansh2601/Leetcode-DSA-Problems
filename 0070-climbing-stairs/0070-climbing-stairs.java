class Solution {
    public int climbStairs(int n) {
          int[] dp=new int[n];
          Arrays.fill(dp,-1);

          return memoization(n,dp);

    }
    public int memoization(int n,int[] dp){
        if(n==1||n==2)
        return n;

        if(dp[n-1]!=-1)
        return dp[n-1];

        return dp[n-1]=memoization(n-1,dp)+memoization(n-2,dp);
    }
}