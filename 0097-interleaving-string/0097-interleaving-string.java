class Solution {
    int n;
    int m;
    Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        n=s1.length();
        m=s2.length();

       if((n+m)!=s3.length())
       return false;

       dp=new Boolean[n+1][m+1];

       return solve(0,0,s1,s2,s3);

    }

    public boolean solve(int i,int j,String s1,String s2,String s3)
    {
         if(i==n && j==m)return true;


        if(dp[i][j] !=null)return dp[i][j];

        int k=i+j;
        boolean ans=false;

        if( i<n && s1.charAt(i)==s3.charAt(k))
        {
            ans=solve(i+1,j,s1,s2,s3);
        }

        if(!ans && j<m && s2.charAt(j)==s3.charAt(k))
        {
            ans=solve(i,j+1,s1,s2,s3);
        }

        return dp[i][j]=ans;
    }
}