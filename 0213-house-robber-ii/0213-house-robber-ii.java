class Solution {
    public int rob(int[] nums) {

    
        int n=nums.length;
        if(n==1)
        return nums[0];
        int[] dp1=new int[n+1];
        int[] dp2=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solve1(0,n-1,nums,dp1),solve2(1,n,nums,dp2));
    }
    public int solve1(int i,int end,int[] nums,int[] dp)
    {   
        if(i>=end)
         return 0;

        if(dp[i]!=-1)
        return dp[i];

        return dp[i]=Math.max(nums[i]+solve1(i+2,end,nums,dp),solve1(i+1,end,nums,dp));
    }

    public int solve2(int i,int end,int[] nums,int[] dp)
    {   
        if(i>=end)
         return 0;

       

        if(dp[i]!=-1)
        return dp[i];

          return dp[i]=Math.max(nums[i]+solve1(i+2,end,nums,dp),solve1(i+1,end,nums,dp));
    }
}