class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()+1][p.length()+1];

        return solve(0,0,s,p);
    }

    public boolean solve(int i,int j,String s,String p)
    {
        if(j==p.length())
        {
            return i==s.length();
        }

        if(dp[i][j] !=null) return dp[i][j];

        boolean firstchar=false;

        if( i<s.length()  && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'))
         firstchar=true;



        if( j+1<p.length() && p.charAt(j+1)=='*')
        {
            boolean skip=solve(i,j+2,s,p);

            boolean take= firstchar && solve(i+1,j,s,p);

            return dp[i][j]= take||skip;
        }

        return dp[i][j]= firstchar && solve(i+1,j+1,s,p);
    }
}