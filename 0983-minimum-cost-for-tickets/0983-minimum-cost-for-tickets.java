class Solution {
    Integer[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        
        int n=days.length;
        dp=new Integer[n];

       return solve(0,days,costs);
    }


    public int solve(int i,int[] days,int[] cost)
    {
        int n=days.length;
        if(i==n)return 0;

        if(dp[i]!=null)return dp[i];

        int cost1=cost[0]+solve(i+1,days,cost);

        int max_day7=days[i]+7;

        int j=i;

        while( j<n && days[j]<max_day7)
        {
            j++;
        }

        int cost2=cost[1]+solve(j,days,cost);

        int max_day30=days[i]+30;

        j=i;

        while(j<n && days[j]<max_day30)
        {
            j++;
        }

        int cost3=cost[2]+solve(j,days,cost);

        return dp[i]=Math.min(cost1,Math.min(cost2,cost3));
    }
}