class Solution {

    boolean ans=false;
    public boolean exist(char[][] board, String word) {
        
          int m=board.length;
          int n=board[0].length;
         

          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                if(ans)
                return ans;

                solve(i,j,0,board,word);
    
            }
          }


          return ans;
    }

    public void solve(int i,int j,int k,char[][] board,String word)
    {
        int m=board.length;
        int n=board[0].length;


        if(i<0||j<0|| i>=m||j>=n||board[i][j]=='#' || k>=word.length() || word.charAt(k)!=board[i][j])
        return;

        if(k==word.length()-1)
         {
             ans=true;
             return;
         }

         char temp=board[i][j];
         board[i][j]='#';

         solve(i+1,j,k+1,board,word);
         solve(i,j+1,k+1,board,word);
         solve(i-1,j,k+1,board,word);
         solve(i,j-1,k+1,board,word);
 
        board[i][j]=temp;

    }
}