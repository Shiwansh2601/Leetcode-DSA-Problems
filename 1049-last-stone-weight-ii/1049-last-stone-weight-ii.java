class Solution {
    public int lastStoneWeightII(int[] arr) {
         int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
        }
        
        int sum=total/2;
        
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j>0 && i==0)
                dp[i][j]=false;
                
                if(j==0)
                dp[i][j]=true;
            }
        }
        
        issubsetexist(arr,n,sum,dp);
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=sum;i++)
        {
            if(dp[n][i])
            list.add(i);
        }
        
        int min=Integer.MAX_VALUE;
        for(int num:list)
        {
            min=Math.min(min,total-2*num);
        }
        
        return min;
    }

    public void issubsetexist(int[] arr,int n,int sum,boolean[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
    }
}