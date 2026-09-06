class Solution {

    public int minCost(int n, int[] cuts) {
        int[][] dp=new int[103][103];
        Arrays.sort(cuts);
        for(int i=0;i<=102;i++)
        {
            Arrays.fill(dp[i],-1);
        }
         
         int[] temp=new int[cuts.length+2];
         temp[0]=0;
         temp[temp.length-1]=n;
         for(int i=1;i<temp.length-1;i++)
         {
            temp[i]=cuts[i-1];
         }
        return solve(1,cuts.length,temp,dp);
    }
    public int solve(int i,int j,int[] arr,int[][] dp)
    {
        if(i>j)
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int res=Integer.MAX_VALUE;

        for(int k=i;k<=j;k++)
        {
            int cost=arr[j+1]-arr[i-1];

            int l=solve(i,k-1,arr,dp);
            int r=solve(k+1,j,arr,dp);

            res=Math.min(res,cost+l+r);


        
        }
        
       return dp[i][j]=res;
    }
}