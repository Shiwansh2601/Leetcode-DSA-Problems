class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);

        for(int i=nums.length-1;i>=2;i--)
        {
            int r=i-1;
            int l=0;
            while(l<r)
            {
                if(nums[l]+nums[r]>nums[i])
                {
                 count+=r-l;
                 r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return count;
    }
}