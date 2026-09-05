class Solution {
    Integer[][] dp;
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;

        dp=new Integer[n][2];

        return solve(0,0,fee,prices);
    }

     public int solve(int i,int buy,int fee,int[] arr)
    {
        if(i==arr.length)return 0;

        if(dp[i][buy]!=null) return dp[i][buy];

        int profit=0;

        if(buy==0)//allow to buy.........
        {
            int take=-arr[i]+solve(i+1,1,fee,arr);
            int skip=solve(i+1,0,fee,arr);

            profit=Math.max(take,skip);
        }
        else
        {
            int take=arr[i]-fee+solve(i+1,0,fee,arr);
            int skip=solve(i+1,1,fee,arr);

            profit=Math.max(take,skip);
        }

        dp[i][buy]=profit;

        return profit;
    }
}