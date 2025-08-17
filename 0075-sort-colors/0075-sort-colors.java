class Solution {
    public void sortColors(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }

         for(int i=index;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
    }
}