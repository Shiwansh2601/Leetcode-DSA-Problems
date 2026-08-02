class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        

        // Initialization............
        int a=nums[0];

        if(n==1)return a;
        
        int b=Math.max(a,nums[1]);

        for(int i=2;i<n;i++)
        {
            int take=nums[i]+a;
            int ntake=b;

            int c=Math.max(nums[i]+a,b);

            a=b;
            b=c;
        }

        return b;
       
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