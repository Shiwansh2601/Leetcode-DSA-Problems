class Solution {
    public boolean isMatch(String s, String p) {
        int n1=s.length();
        int n2=p.length();
        int[][] dp=new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(n1-1,n2-1,s,p,dp);
    }

    public boolean solve(int i,int j,String s,String p,int[][] dp)
    {
        if(i<0 && j<0)
        return true;

        if(i>=0 && j<0)
        return false;
        else if(i<0 && j>=0)
        {
            while(j>=0)
            {
                if(p.charAt(j)!='*')
                return false;

                j--;
            }

            return true;
        }

        if(dp[i][j]!=-1)
        return dp[i][j]==1;

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
         dp[i][j]=solve(i-1,j-1,s,p,dp)?1:0;
        else if(p.charAt(j)=='*')
        {
         dp[i][j]=solve(i-1,j,s,p,dp)||solve(i,j-1,s,p,dp)?1:0;
        }
        else
        dp[i][j]=0;


        return dp[i][j]==1;
    }
}