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
        return solve(0,temp.length-1,temp,dp);
    }
    public int solve(int i,int j,int[] arr,int[][] dp)
    {
        if(j-i<2)
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int res=Integer.MAX_VALUE;
        
        for(int indx=i+1;indx<=j-1;indx++)
        {
           int curr=(arr[j]-arr[i])+solve(i,indx,arr,dp)+solve(indx,j,arr,dp);

           res=Math.min(res,curr);
        }

       return dp[i][j]=res;
    }
}