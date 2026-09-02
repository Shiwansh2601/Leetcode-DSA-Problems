class Solution {

    public boolean isValid(char[][] board,int r,int c,char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[r][i]==ch)
            return false;

            if(board[i][c]==ch)
            return false;
        }


        int sr=(r/3)*3;
        int sc=(c/3)*3;


        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                if(board[k+sr][l+sc]==ch)
                return false;
            }

        }

        return true;
    }
    public boolean solve(char[][] board)
    {

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char d='1';d<='9';d++)
                    {
                        if(isValid(board,i,j,d))
                        {
                            board[i][j]=d;
                            if(solve(board))
                            return true;

                            board[i][j]='.';

                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}