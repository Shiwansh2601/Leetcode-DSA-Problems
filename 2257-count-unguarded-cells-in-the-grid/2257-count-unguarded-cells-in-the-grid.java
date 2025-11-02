class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int[][] grid=new int[m][n];
        for(int i=0;i<walls.length;i++)
        {
            int x=walls[i][0];
            int y=walls[i][1];
            grid[x][y]=1;
        }

         for(int i=0;i<guards.length;i++)
        {
            int x=guards[i][0];
            int y=guards[i][1];
            grid[x][y]=1;
        }

         for(int i=0;i<guards.length;i++)
        {    
            //left
            int x=guards[i][0];
            int y=guards[i][1]-1;
            while(y>=0 && grid[x][y]!=1)
            {
                grid[x][y]=2;
                y--;
            }

            //right
            x=guards[i][0];
            y=guards[i][1]+1;
           while(y<n && grid[x][y]!=1)
            {
                grid[x][y]=2;
                y++;
            }

            //top
             x=guards[i][0]-1;
            y=guards[i][1];
           while(x>=0 && grid[x][y]!=1)
            {
                grid[x][y]=2;
                x--;
            }
            
            //down
             x=guards[i][0]+1;
            y=guards[i][1];
           while(x<m && grid[x][y]!=1)
            {
                grid[x][y]=2;
                x++;
            }


        }
        
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                count++;
            }
        }

        return count;
        
    }
}