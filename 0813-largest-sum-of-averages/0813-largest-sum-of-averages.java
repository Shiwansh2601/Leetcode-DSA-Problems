class Solution {

     int[] arr;
    int k;
    Double[][] dp;
    public double largestSumOfAverages(int[] nums, int k) {
        arr=nums;
        this.k=k;
        
        dp=new Double[arr.length][arr.length+1];

        return solve(0,k);
    }

     public double solve(int i,int k)
    {
          if(i==arr.length)return 0.0;
          
          if(k==1)
          {
            int sum=0;
            int len=0;
            while(i<arr.length)
            {
                sum+=arr[i++];
                len++;
            }

            return (double)sum/len;
          }
          
          if(dp[i][k]!=null ) return dp[i][k];

          int len=0;
          int sum=0;
          
          double ans=0.0;

          for(int j=i;j<arr.length;j++)
          {
            len++;
            sum+=arr[j];
            double avg= (double)sum/len;
           
            double next=0.0;
           if(k>0)
           {
               next=solve(j+1,k-1);
               ans=Math.max(ans,next+avg);
           }

          }

          return dp[i][k]=ans;
}

}