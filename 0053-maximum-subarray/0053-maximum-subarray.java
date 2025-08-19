class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int maxsum=nums[0];
        if(nums.length==1)
        return nums[0];

        for(int val:nums)
        {
            sum+=val;
            maxsum=Math.max(sum,maxsum);
            if(sum<0)
            sum=0;
        }
        return maxsum;
    }
}