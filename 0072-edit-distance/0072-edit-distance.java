class Solution {
    public int minDistance(String word1, String word2) {
         int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(word1.length(),word2.length(),word1,word2,dp);
    }

     public int solve(int n,int m,String s1,String s2,int[][] dp)
    {
        if(n==0)
        return m;
        
        if(m==0)
        return n;
        
        
        if(dp[n][m]!=-1)
        return dp[n][m];
        
        
        if(s1.charAt(n-1)==s2.charAt(m-1))
         return dp[n][m]=solve(n-1,m-1,s1,s2,dp);
        else
        {
            return dp[n][m]=1+Math.min(solve(n-1,m-1,s1,s2,dp),Math.min(solve(n-1,m,s1,s2,dp),solve(n,m-1,s1,s2,dp)));
        }
    }
}