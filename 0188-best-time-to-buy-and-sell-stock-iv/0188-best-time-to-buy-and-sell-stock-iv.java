class Solution {
    public int maxProfit(int k,int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][k+1];

        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<2;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }

        return solve(0,0,k,prices,dp);
    }


    public int solve(int i,int f,int cap,int[] arr,int[][][] dp)
    {
        if(i==arr.length|| cap==0)
        return 0;

        if(dp[i][f][cap]!=-1)
        return dp[i][f][cap];
        
        int pro=0;
        if(f==0)
        {
             pro= Math.max(-arr[i]+solve(i+1,1,cap,arr,dp),solve(i+1,0,cap,arr,dp));
        }
        else
        {
            pro= Math.max(arr[i]+solve(i+1,0,cap-1,arr,dp),solve(i+1,1,cap,arr,dp));
        }

        return dp[i][f][cap]=pro;
    }
}