class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];

        // Initialization............
        dp[0]=nums[0];
        if(n>1)
        dp[1]=Math.max(dp[0],nums[1]);

        for(int i=2;i<n;i++)
        {
            int take=nums[i]+dp[i-2];
            int ntake=dp[i-1];

            dp[i]=Math.max(take,ntake);
        }

        return dp[n-1];
       
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