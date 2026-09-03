class Solution {
    int n;
    Integer[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        dp=new Integer[n][n];

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            ans=Math.min(ans,solve(0,i,matrix));
        }

        return ans;
    }


    public int solve(int i,int j,int[][] mat)
    {
        if(j<0 || j>=n)return Integer.MAX_VALUE;

        if(i==n-1)
        return mat[i][j];


        if(dp[i][j]!=null)return dp[i][j];

        int l=solve(i+1,j-1,mat);
        int r=solve(i+1,j+1,mat);
        int d=solve(i+1,j,mat);

        return dp[i][j]=mat[i][j]+Math.min(Math.min(l,r),d);
    }
}