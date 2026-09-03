class Solution {
    Integer[][] dp;
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        dp=new Integer[n][target+1];

        return solve(0,nums,target);
    }

    public int solve(int indx,int[] nums,int target)
    {
        if(target==0)return 1;

        if(indx==nums.length|| target<0)return 0;

        if(dp[indx][target]!=null)return dp[indx][target];
        
        int take=solve(0,nums,target-nums[indx]);
        int skip=solve(indx+1,nums,target);

        return dp[indx][target]=take+skip;

    }
}