class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        
        
        for(int i=0;i<nums.length;i++)
        {
             if(map.containsKey(nums[i]))
             {
                map.put(nums[i],map.get(nums[i])+nums[i]);
             }
             else 
             {
                map.put(nums[i],nums[i]);
             }
        }
       
       int[] dp=new int[10002];
       Arrays.fill(dp,-1);


        return solve(1,dp);

    }

    public int solve(int n,int[] dp)
    {
        if(n>=10001)return 0;

        if(dp[n]!=-1)return dp[n];

        if(map.containsKey(n))
        return dp[n]=Math.max(map.get(n)+solve(n+2,dp),solve(n+1,dp));

        return dp[n]=solve(n+1,dp);
    }
}