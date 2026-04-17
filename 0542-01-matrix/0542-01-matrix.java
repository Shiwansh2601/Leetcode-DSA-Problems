class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int[][] ans=new int[n][m];

        Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {    
                if(mat[i][j]==0)
                {
                    q.add(new int[]{i,j,0});
                }
                else 
                {
                    ans[i][j]=Integer.MAX_VALUE;
                }

                
            }
        }

       int[] dr={-1,1,0,0};
       int[] dc={0,0,1,-1};
       while(q.size()>0)
       {
          int[] temp=q.remove();

          int i=temp[0];
          int j=temp[1];
          int lvl=temp[2];

         
          
          for(int k=0;k<4;k++)
          {
            int ni=i+dr[k];
            int nj=j+dc[k];

            if(ni>=0 && nj>=0 && ni<n && nj<m && ans[ni][nj]>lvl+1)
            {
                q.add(new int[]{ni,nj,lvl+1});
                ans[ni][nj]=lvl+1;
                
            }
          }
          
       }

      return ans;

    }
}