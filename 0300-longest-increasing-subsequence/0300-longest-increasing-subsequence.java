class Solution {
    
    public int lengthOfLIS(int[] nums) {
       int[] dp=new int[nums.length];
       Arrays.fill(dp,-1);
       int res=1;

       for(int i=1;i<nums.length;i++)
       {
        res=Math.max(res,lisAtindx(i,nums,dp));
       }

       return res;
    }
    
    public int lisAtindx(int indx ,int[] nums,int[] dp)
    {
       if(indx==0)
       return 1;


      if(dp[indx]!=-1)
      return dp[indx];


       int max=1;
       for(int prev=0;prev<indx;prev++)
       {
          if(nums[prev]<nums[indx])
          max=Math.max(max,lisAtindx(prev,nums,dp)+1);
       }
       return dp[indx]=max;
    }
   
}

