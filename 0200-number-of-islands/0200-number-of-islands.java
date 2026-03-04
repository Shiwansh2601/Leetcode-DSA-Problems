class Solution {
   
    public void dfs(int i,int j,boolean[][] vis,char[][] grid)
    {
          if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||vis[i][j])
          return;

          vis[i][j]=true;
          dfs(i+1,j,vis,grid);
          dfs(i,j+1,vis,grid);
          dfs(i-1,j,vis,grid);
          dfs(i,j-1,vis,grid);
    }
    
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!vis[i][j] &&grid[i][j]=='1')
                {
                    res++;
                    dfs(i,j,vis,grid);
                }
            }
        }

    return res;

    }
}