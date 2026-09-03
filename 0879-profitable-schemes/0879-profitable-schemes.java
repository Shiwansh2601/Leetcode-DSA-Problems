class Solution {

    long mod=1000000007;
    
     int min;
    Long[][][] dp=new Long[101][101][101];

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        min=minProfit;
        return (int)solve(0,0,n,group,profit);

    }

    public long solve(int i,int p,int n,int[] group,int[] profit)
    {
        if(n==0)
        return p >= min ? 1 : 0;

        if(i==group.length)
         return p >= min ? 1 : 0;

         

        if(dp[i][p][n]!=null)return dp[i][p][n];

        
        if(group[i]<=n)
        return dp[i][p][n]=(solve(i+1,Math.min(p+profit[i],min),n-group[i],group,profit)%mod +solve(i+1,p,n,group,profit)%mod)%mod;
        else
        return dp[i][p][n]=solve(i+1,p,n,group,profit)%mod;

    }
}