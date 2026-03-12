class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==0||j==0||i==m-1||j==n-1)
               {
                   if(!vis[i][j] &&grid[i][j]==1)
                   dfs(i,j,vis,grid);
               }
            }
        }

         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               
                   if(grid[i][j]==1)
                   count++;
            }
        }

        return count;
    }
   

    public void dfs(int i,int j,boolean[][] vis,int[][] grid)
    {  
        
      int m=grid.length;
      int n=grid[0].length;

      if(i<0||j<0||i>=m||j>=n||vis[i][j]||grid[i][j]==0)
      return ;

      vis[i][j]=true;
      grid[i][j]=0;

      dfs(i+1,j,vis,grid);
      dfs(i-1,j,vis,grid);
      dfs(i,j+1,vis,grid);
      dfs(i,j-1,vis,grid);
        


    }
}