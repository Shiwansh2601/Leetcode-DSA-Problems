class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-10001);
        return solve(0,0,n,triangle,dp);
    }

    public int solve(int i,int j,int n,List<List<Integer>> triangle,int[][] dp)
    {
        if(i>=n||j>=triangle.get(i).size())
        return 0;

        if(i==n-1)
        {
            return triangle.get(i).get(j);
        }

        if(dp[i][j]!=-10001)
        return dp[i][j];

        int s=solve(i+1,j,n,triangle,dp);
        int r=solve(i+1,j+1,n,triangle,dp);

        return dp[i][j]=Math.min(s,r)+triangle.get(i).get(j);
    }
}