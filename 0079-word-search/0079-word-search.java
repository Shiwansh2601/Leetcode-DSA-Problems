class Solution {

    boolean ans=false;
    public boolean exist(char[][] board, String word) {
        
          int m=board.length;
          int n=board[0].length;
          boolean[][] vis=new boolean[m][n];

          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                if(ans)
                return ans;

                solve(i,j,0,board,vis,word);
    
            }
          }


          return ans;
    }

    public void solve(int i,int j,int k,char[][] board ,boolean[][] vis,String word)
    {
        int m=board.length;
        int n=board[0].length;


        if(i<0||j<0|| i>=m||j>=n|| vis[i][j] || k>=word.length() || word.charAt(k)!=board[i][j])
        return;

        if(k==word.length()-1)
         {
             ans=true;
             return;
         }

         vis[i][j]=true;
         solve(i+1,j,k+1,board,vis,word);
         solve(i,j+1,k+1,board,vis,word);
         solve(i-1,j,k+1,board,vis,word);
         solve(i,j-1,k+1,board,vis,word);

         vis[i][j]=false;

    }
}