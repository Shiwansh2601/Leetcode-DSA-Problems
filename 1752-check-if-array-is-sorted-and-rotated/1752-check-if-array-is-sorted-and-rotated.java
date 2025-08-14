  class Solution 
{
    public boolean check(int[] nums) 
    {
        if(nums.length==0 && nums.length==1)
        return true;
     
     int inversion_count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            inversion_count++;
        }
        if(nums[0]<nums[nums.length-1])
         inversion_count++;

         if(inversion_count<=1)
         return true;
         else
         return false;
    }
}

