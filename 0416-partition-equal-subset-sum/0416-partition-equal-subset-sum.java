class Solution {

    // Memoization DP
    public boolean canPartition(int[] nums) {
        return solve(nums);
    }

    public boolean solve(int[] arr)
    {
        int sum=0;
      for(int i=0;i<arr.length;i++)
      {
          sum+=arr[i];
      }
      
      if(sum%2!=0)
      return false;
      else
      {
         int[][] dp=new int[arr.length+1][sum/2+1];
         for(int i=0;i<=arr.length;i++)
         {
            Arrays.fill(dp[i],-1);
         }

         return subsetsum(arr,arr.length,sum/2,dp);
      }
      
    }
    public boolean subsetsum(int arr[],int n, int sum,int[][] dp) {
        
        if(sum>0 && n==0)
        return false;
        
        if(sum==0)
        return true;
        
        if(dp[n][sum]!=-1)
        return dp[n][sum]==1;

        if(arr[n-1]<=sum)
        dp[n][sum]=subsetsum(arr,n-1,sum-arr[n-1],dp) ||subsetsum(arr,n-1,sum,dp)?1:0;
        else
         dp[n][sum]=subsetsum(arr,n-1,sum,dp)?1:0;

          return dp[n][sum]==1;
    }
}