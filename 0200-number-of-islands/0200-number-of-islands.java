class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;

       boolean[][] vis=new boolean[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(!vis[i][j] && grid[i][j]!='0')
              {
                 dfs(i,j,vis,grid);
                 count++;
              }
            
            }
        }
       
       return count;
        
    }

    public void dfs(int i,int j,boolean[][] vis,char[][] grid)
    {
        int  m=grid.length;
        int n=grid[0].length;

        if(i<0 || i>=m||j<0||j>=n || vis[i][j] || grid[i][j]=='0')
        return;

        grid[i][j]='0';
        vis[i][j]=true;

        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        for(int k=0;k<4;k++)
        {
            dfs(i+dx[k],j+dy[k],vis,grid);
        }

        

    }
}