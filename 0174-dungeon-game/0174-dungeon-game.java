class Solution {

    int m;
    int n;
    Integer[][] dp;
    public int calculateMinimumHP(int[][] dungeon) {
        
        m=dungeon.length;
        n=dungeon[0].length;
        dp=new Integer[m][n];
        return solve(0,0,dungeon);
       
        
    }

    public int solve(int i,int j,int[][] grid)
    {

        if(i>=m ||j>=n)return Integer.MAX_VALUE;

        if(i==m-1 && j==n-1)
        {
            if(grid[i][j]<=0)return Math.abs(grid[i][j])+1;

            return 1;
        }


        if(dp[i][j]!=null)return dp[i][j];

        int r=solve(i,j+1,grid);
        int d=solve(i+1,j,grid);

        int res=Math.min(r,d)-grid[i][j];

        return dp[i][j]=res<=0?1:res;
    }

    
}