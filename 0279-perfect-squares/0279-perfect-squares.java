class Solution {

    Integer[][] dp;
    int count;
    public int numSquares(int n) {
        
         count=(int)Math.sqrt(n);
        dp=new Integer[count+1][n+1];

        return solve(1,n);
    }

    public int solve(int i,int rem)
    {
        if(rem == 0)return 0;

        if(i>count) return Integer.MAX_VALUE;

        if(dp[i][rem]!=null)return dp[i][rem];

        int sq=i*i;

        int skip=solve(i+1,rem);

        int take=Integer.MAX_VALUE;

        if(sq<=rem)
        {
            int next=solve(i,rem-sq);

            if(next!=Integer.MAX_VALUE)
            take=next+1;
        }

        return dp[i][rem]=Math.min(take,skip);

    }
}