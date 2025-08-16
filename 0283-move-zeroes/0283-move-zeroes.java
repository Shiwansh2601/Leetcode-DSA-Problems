class Solution {
    public void moveZeroes(int[] nums) {
        int res=0;
        int temp;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]!=0)
             {
                temp=nums[i];
                nums[i]=nums[res];
                nums[res]=temp;
                res++;

             }
        }
    }
}