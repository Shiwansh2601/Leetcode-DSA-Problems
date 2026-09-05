class Solution {
    Integer[][] dp;
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new Integer[n][2];

        return solve(0,0,prices);
    }

    public int solve(int i,int buy,int[] arr)
    {
        if(i>=arr.length)return 0;

        if(dp[i][buy]!=null) return dp[i][buy];

        int profit=0;

        if(buy==0)//allow to buy.........
        {
            int take=-arr[i]+solve(i+1,1,arr);
            int skip=solve(i+1,0,arr);

            profit=Math.max(take,skip);
        }
        else
        {
            int take=arr[i]+solve(i+2,0,arr);
            int skip=solve(i+1,1,arr);

            profit=Math.max(take,skip);
        }

        dp[i][buy]=profit;

        return profit;
    }
}