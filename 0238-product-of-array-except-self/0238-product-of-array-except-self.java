class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix=nums[0];
        int[] ans=new int[nums.length];
        Arrays.fill(ans, 1); 
        for(int i=1;i<nums.length;i++)
        {
            ans[i]*=prefix;
            prefix*=nums[i];
        }

        int suffix=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--)
        {
            ans[j]*=suffix;
            suffix*=nums[j];
        }
        return ans;
    }
}