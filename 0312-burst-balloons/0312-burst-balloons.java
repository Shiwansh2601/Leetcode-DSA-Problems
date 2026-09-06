class Solution {
    int[] arr;
    Integer[][] dp;

    public int maxCoins(int[] nums) {
      
        
         int n=nums.length;
           dp=new Integer[n+2][n+2];

         arr=new int[nums.length+2];
         arr[0]=1;
         arr[arr.length-1]=1;
         for(int i=1;i<arr.length-1;i++)
         {
            arr[i]=nums[i-1];
         }
        return solve(1,n);
    }

     public int solve(int i,int j)
    {
        if(i>j)
        return 0;

        if(dp[i][j]!=null)
        return dp[i][j];
        
        int res=0;

        for(int k=i;k<=j;k++)
        {
            int cost=arr[i-1]*arr[k]*arr[j+1];

            int l=solve(i,k-1);
            int r=solve(k+1,j);

            res=Math.max(res,cost+l+r);


        
        }
        
       return dp[i][j]=res;
    }
}