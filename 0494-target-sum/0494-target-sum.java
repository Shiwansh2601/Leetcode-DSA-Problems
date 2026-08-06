class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        
        solve(0,0,nums,target);
        return count;
    }

    public void solve(int sum,int i,int[] nums,int t)
    {
        if(i==nums.length)
        {
            if(sum==t)
            count++;

            return;
        }


        sum+=nums[i];
        solve(sum,i+1,nums,t);
        sum-=nums[i];


        sum-=nums[i];
        solve(sum,i+1,nums,t);
        sum+=nums[i];
    }
}