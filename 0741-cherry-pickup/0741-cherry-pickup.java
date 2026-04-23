class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][][] dp = new int[n][n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                      Arrays.fill(dp[i][j][k],-1);
                }
            }
        }

        return Math.max(0,solve(0,0,0,0,grid,dp));
    }

    public int solve(int r1,int c1,int r2,int c2,int[][] grid,int[][][][] dp)
    {
        int n = grid.length;
        if(r1>=n ||r2>=n||c1>=n||c2>=n ||grid[r1][c1]==-1||grid[r2][c2]==-1)
        return Integer.MIN_VALUE;

        if(dp[r1][c1][r2][c2]!=-1) return dp[r1][c1][r2][c2];

        int d1=grid[r1][c1];
        int d2=grid[r2][c2];
        
        int cherry=0;
        if(r1==r2 && c1==c2)
        {
              cherry+=grid[r1][c1];

              if(r1==n-1 && c1==n-1)
              {
                dp[r1][c1][r2][c2]=grid[r1][c1];
                return dp[r1][c1][r2][c2];
              }

              grid[r1][c1]=0;

        }
        else
        {
            cherry+=d1+d2;

            grid[r1][c1]=0;
            grid[r2][c2]=0;

        }


        int p1=solve(r1+1,c1,r2+1,c2,grid,dp);
        int p2=solve(r1,c1+1,r2,c2+1,grid,dp);
        int p3=solve(r1+1,c1,r2,c2+1,grid,dp);
        int p4=solve(r1,c1+1,r2+1,c2,grid,dp);
        
        grid[r1][c1]=d1;
        grid[r2][c2]=d2;
        return dp[r1][c1][r2][c2]=cherry+Math.max(p1,Math.max(p2,Math.max(p3,p4)));
    }
}