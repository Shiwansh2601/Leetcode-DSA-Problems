class Solution {
    int m;
    int n;
    Integer[][][] dp;
    public int cherryPickup(int[][] grid) {
        m=grid.length;
        n=grid[0].length;

        dp=new Integer[m][n][n];

        return solve(0,0,n-1,grid);
        
    }


    public int solve(int i,int j1,int j2,int[][] grid)
    {
        if(j1<0 || j2<0 ||j1>=n ||j2>=n)return 0;

        if(i==m-1)
        {
             if(j1==j2)
             return grid[i][j1];


             return grid[i][j1]+grid[i][j2];
        }


        if(dp[i][j1][j2] !=null)return dp[i][j1][j2];


        int score=grid[i][j1];

        if(j1!=j2)
        score+=grid[i][j2];


        int a=solve(i+1,j1,j2-1,grid);
        int b=solve(i+1,j1,j2+1,grid);
        int c=solve(i+1,j1,j2,grid);

        int ans1=Math.max(a,Math.max(b,c));

        int d=solve(i+1,j1-1,j2-1,grid);
        int e=solve(i+1,j1-1,j2+1,grid);
        int f=solve(i+1,j1-1,j2,grid);

        int ans2=Math.max(d,Math.max(e,f));

        
        int g=solve(i+1,j1+1,j2-1,grid);
        int h=solve(i+1,j1+1,j2+1,grid);
        int k=solve(i+1,j1+1,j2,grid);

        int ans3=Math.max(g,Math.max(h,k));

        
        return dp[i][j1][j2]=score+Math.max(ans1,Math.max(ans2,ans3));
        
    }
}