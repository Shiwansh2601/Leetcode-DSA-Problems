class Solution {
    public int rob(int[] nums) {
        int n=nums.length-1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,nums,dp);
    }

    public int solve(int n,int[] arr,int[] dp)
    {
        if(n<0)return 0;

        if(n==0)return arr[n];

        if(dp[n]!=-1)return dp[n];

        int take= arr[n]+solve(n-2,arr,dp);
        int ntake=solve(n-1,arr,dp);

        return dp[n]=Math.max(take,ntake);
    }
}