class Solution {
    public int change(int amount, int[] coins) {
         int n=coins.length;
       
       

        int[][] dp=new int[amount+1][coins.length+1];

        for(int i=0;i<=amount;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int res=solve(0,coins,amount,dp);

        

        return res;
    }

     public int solve(int i,int[] coins,int n,int[][] dp){
        if(n==0)
        {
            return dp[n][i]=1;
        }
        
        if(n<0 || i==coins.length)
        return 0;
       
      if(dp[n][i]!=-1)
      return dp[n][i];

        if(coins[i]<=n)
        {
            return dp[n][i]=solve(i,coins,n-coins[i],dp )+solve(i+1,coins,n,dp);
        }
        else
        {
            return dp[n][i]=solve(i+1,coins,n,dp);
        }

}

}