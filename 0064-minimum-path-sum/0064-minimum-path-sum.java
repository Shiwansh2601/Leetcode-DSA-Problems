class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
         int max=Integer.MAX_VALUE;
         int[][] dp=new int[m][n];
         dp[0][0]=grid[0][0];  //intialization
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                if(i>0 && j>0)
                {
                    dp[i][j]=grid[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);
                }
                else
                {
                    if(i==0 && j==0)
                    continue;

                    if(i==0)
                    {
                        dp[i][j]=grid[i][j]+Math.min(dp[i][j-1],max);
                    }
                    else
                    {
                        dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],max);
                    }
                }
            }
         }

         return dp[m-1][n-1];
      
    }

}