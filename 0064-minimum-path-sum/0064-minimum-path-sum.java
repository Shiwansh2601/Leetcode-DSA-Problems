class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

         int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(grid,dp,m,n,0,0);
    }

     public int solve(int[][] mat,int[][] dp,int m,int n,int i,int j)
    {
        if(i==m-1 && j==n-1)
        {
            return mat[i][j];
        }
        
        if(i<0 ||i>=m  ||j<0 || j>=n)
        {
            return Integer.MAX_VALUE;
        }
        
       if(dp[i][j]!=-1)
       return dp[i][j];
       
       
        
        int down=solve(mat,dp,m,n,i+1,j);
        int right=solve(mat,dp,m,n,i,j+1);
        
        return dp[i][j]=Math.min(down,right)+mat[i][j];
    }
}