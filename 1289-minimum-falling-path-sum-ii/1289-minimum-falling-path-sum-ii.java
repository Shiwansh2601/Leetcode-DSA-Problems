class Solution {
    int n;
    Integer[][] dp;
    public int minFallingPathSum(int[][] grid) {
        n=grid.length;

        dp=new Integer[n][n];

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            ans=Math.min(ans,solve(i,0,grid));
        }

        return ans;
    }


    public int solve(int col,int row,int[][] grid)
    {

        if(row==n-1)
        return grid[row][col];


        if(dp[row][col]!=null)return dp[row][col];


        int res=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(i!=col)
            {
                res=Math.min(res,solve(i,row+1,grid));
            }
        }

        return dp[row][col]=grid[row][col]+res;
    }
}