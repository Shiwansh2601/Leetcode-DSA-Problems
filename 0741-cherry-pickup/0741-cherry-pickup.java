class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[2*n][n][n];
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < n; j++) {
               Arrays.fill(dp[i][j],-1);
            }
        }

        return Math.max(0,solve(0,0,0,grid,dp));
    }

    public int solve(int t,int r1,int r2,int[][] grid,int[][][] dp)
    {
        int n = grid.length;
        int c1=t-r1;
        int c2=t-r2;

        if(r1>=n ||r2>=n||c1>=n||c2>=n ||grid[r1][c1]==-1||grid[r2][c2]==-1)
        return Integer.MIN_VALUE;

        if(dp[t][r1][r2]!=-1) return dp[t][r1][r2];

        int d1=grid[r1][c1];
        int d2=grid[r2][c2];
        
        int cherry=0;
        if(r1==r2 && c1==c2)
        {
              cherry+=grid[r1][c1];

              if(r1==n-1 && c1==n-1)
              {
                dp[t][r1][r2]=grid[r1][c1];
                return dp[t][r1][r2];
              }

              

        }
        else
        {
            cherry+=d1+d2;

            

        }


        int p1=solve(t+1,r1+1,r2+1,grid,dp);
        int p2=solve(t+1,r1+1,r2,grid,dp);
        int p3=solve(t+1,r1,r2+1,grid,dp);
        int p4=solve(t+1,r1,r2,grid,dp);
        
            
       
        return dp[t][r1][r2]=cherry+Math.max(p1,Math.max(p2,Math.max(p3,p4)));
    }
}