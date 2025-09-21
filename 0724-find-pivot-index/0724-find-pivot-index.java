class Solution {
    public int pivotIndex(int[] nums) {
         int[] presum=new int[nums.length];
        int[] postsum=new int[nums.length];
        presum[0]=nums[0];
        postsum[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            presum[i]=presum[i-1]+nums[i];
        }

        for(int i=nums.length-2;i>=0;i--)
        {
            postsum[i]=postsum[i+1]+nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(presum[i]==postsum[i])
            return i;
        }

        return -1;
    }
}