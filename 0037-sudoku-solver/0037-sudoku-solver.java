class Solution {
    public boolean isSafe(char[][] board,int row,int col,char dig)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==dig)
            return false;
        }

        for(int i=0;i<9;i++)
        {
            if(board[i][col]==dig)
            return false;
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<=sr+2;i++)
        {
            for(int j=sc;j<=sc+2;j++)
            {
                if(board[i][j]==dig)
                return false;
            }
        }

        return true;
    }
    public boolean helper(char[][] board,int row,int col)
    {
        if(row==9)
        {
            return true;
        }

        int nextr=row;
        int nextc=col+1;
        if(nextc==9)
        {
            nextr=row+1;
            nextc=0;
        }

        if(board[row][col]!='.')
        {
             return helper(board,nextr,nextc);
        }
    
        
        for(char i='1';i<='9';i++)
        {
           if(isSafe(board,row,col,i))
           {
             board[row][col]=i;
           
            if(helper(board,nextr,nextc))
            return true;

            board[row][col]='.';

           }
        }

        return false;
        
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}