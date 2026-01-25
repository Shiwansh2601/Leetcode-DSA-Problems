class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }

        int sum=(target+total);

        if(sum%2!=0 ||Math.abs(target)>total)
        return 0;
       
       int[][] dp=new int[n+1][sum/2+1];
       dp[0][0]=1;

        return issubsetexist(nums,n,sum/2,dp);
    }

    public int issubsetexist(int[] nums,int n,int sum,int[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }

         return dp[n][sum];
    }
}