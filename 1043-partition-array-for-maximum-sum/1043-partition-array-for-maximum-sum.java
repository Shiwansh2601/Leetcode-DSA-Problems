class Solution {
    int[] arr;
    int k;
    Integer[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.arr=arr;
        this.k=k;
        
        dp=new Integer[arr.length];

        return solve(0);
    }

    public int solve(int i)
    {
          if(i==arr.length)return 0;
          
          if(dp[i]!=null ) return dp[i];

          int len=0;
          int max=arr[i];
          
          int ans=0;

          for(int j=i;j<Math.min(arr.length,i+k);j++)
          {
            len++;
            if(arr[j]>max)
            max=arr[j];

            int cost=(len*max)+solve(j+1);

            ans=Math.max(ans,cost);

          }

          return dp[i]=ans;
    }
}