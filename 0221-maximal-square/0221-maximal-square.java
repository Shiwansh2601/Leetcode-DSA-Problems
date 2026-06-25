class Solution {

    int ans = 0;

    public int maximalSquare(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        Integer[][] dp = new Integer[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                solve(i,j,matrix,dp);
            }
        }

        return ans * ans; // area
    }

    int solve(int i,int j,char[][] mat,Integer[][] dp)
    {
        if(i>=mat.length || j>=mat[0].length)
            return 0;

        if(dp[i][j]!=null)
            return dp[i][j];

        int right = solve(i,j+1,mat,dp);
        int down = solve(i+1,j,mat,dp);
        int diag = solve(i+1,j+1,mat,dp);

        if(mat[i][j]=='1')
        {
            dp[i][j] = 1 + Math.min(right,
                           Math.min(down,diag));

            ans = Math.max(ans, dp[i][j]);
        }
        else
        {
            dp[i][j] = 0;
        }

        return dp[i][j];
    }
}