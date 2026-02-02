class Solution {
    
    public int lengthOfLIS(int[] nums) {
       int[][] dp=new int[nums.length][nums.length+1];
       for(int i=0;i<nums.length;i++)
       {
        Arrays.fill(dp[i],-1);
       }
       return solve(-1,0,nums,dp);
    }
    
    public int solve(int last,int indx ,int[] nums,int[][] dp)
    {
       if(indx==nums.length)
       return 0;


      if(dp[indx][last+1]!=-1)
      return dp[indx][last+1];
       int take=0;
       int skip=0;

       if(last==-1||nums[last]<nums[indx])
       {
        take=1+solve(indx,indx+1,nums,dp);
       }

       skip=solve(last,indx+1,nums,dp);

       return dp[indx][last+1]=Math.max(take,skip);
    }
   
}

