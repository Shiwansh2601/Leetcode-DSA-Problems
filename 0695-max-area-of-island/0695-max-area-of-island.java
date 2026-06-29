class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int n=grid.length;
        int m=grid[0].length;
        int count=0;

       boolean[][] vis=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(!vis[i][j] && grid[i][j]!=0)
              {
               int curr= dfs(i,j,vis,grid);
                ans=Math.max(ans,curr);
              }
            
            }
        }
       
       return ans;
    }

     public int dfs(int i,int j,boolean[][] vis,int[][] grid)
    {
        int  m=grid.length;
        int n=grid[0].length;

        if(i<0 || i>=m||j<0||j>=n || vis[i][j] || grid[i][j]==0)
        return 0;

        grid[i][j]=0;
        vis[i][j]=true;
         
         int lans=1;
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        for(int k=0;k<4;k++)
        {
            lans+=dfs(i+dx[k],j+dy[k],vis,grid);
        }

        return lans;

        

    }
}