class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,nums,dp);
    }
    public int solve(int n,int[] nums,int[] dp)
    {   
        if(n<=0)
         return 0;

        if(n==1)
        return dp[n]=nums[0];

        if(dp[n]!=-1)
        return dp[n];

        return dp[n]=Math.max(nums[n-1]+solve(n-2,nums,dp),solve(n-1,nums,dp));
    }
}