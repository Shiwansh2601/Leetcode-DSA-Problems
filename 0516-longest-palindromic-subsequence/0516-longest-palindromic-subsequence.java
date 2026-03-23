class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return lcs(0,0,s,str.toString(),dp);
    }

    public int lcs(int i,int j,String s1,String s2,int[][] dp)
    {

        if(i==s1.length() || j==s2.length())
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j))
        dp[i][j]=1+lcs(i+1,j+1,s1,s2,dp);
        else
        dp[i][j]=Math.max(lcs(i+1,j,s1,s2,dp),lcs(i,j+1,s1,s2,dp));

        return dp[i][j];


    }
}