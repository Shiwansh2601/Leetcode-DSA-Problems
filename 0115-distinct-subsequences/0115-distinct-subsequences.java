class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
         
        Integer[][] dp=new Integer[m+1][n+1];

        if(n>m)return 0;

        return solve(s,t,m,n,dp);
    }

    public int solve(String s,String t,int m,int n,Integer[][] dp)
    {
         if(m==0 && n>0)return 0;

        if(n==0)return 1;
        
        if(dp[m][n]!=null)
        return dp[m][n];

        //match

        if(s.charAt(m-1)==t.charAt(n-1))
        {
           return dp[m][n]= solve(s,t,m-1,n-1,dp)+solve(s,t,m-1,n,dp);
        }
        else
        {
            return dp[m][n]=solve(s,t,m-1,n,dp);
        }
    }
}