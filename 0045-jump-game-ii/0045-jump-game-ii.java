class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];

        Arrays.fill(dp,10000);

        dp[0]=0;
        for(int i=0;i<n;i++)
        {
            int j=1;
             while(j+i<n && j<=nums[i])
            {
                dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                j++;
            }
        }


        return dp[n-1];
    }
}