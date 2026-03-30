class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);

        return solve(0,-1,nums,dp);
    }

    public int solve(int i,int prev,int[] nums,int[][] dp)
    {
        if(i==nums.length)
        return 0;


        if(dp[i][prev+1]!=-1)
        return dp[i][prev+1];

        int take=0;
        int nontake=0;

        if(prev==-1||nums[i]>nums[prev])
        take=1+solve(i+1,i,nums,dp);

        nontake=solve(i+1,prev,nums,dp);

        return dp[i][prev+1]=Math.max(take,nontake);

    }
}