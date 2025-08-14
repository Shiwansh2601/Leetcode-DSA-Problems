  class Solution 
{
    public boolean check(int[] nums) 
    {
     int[] arr = nums.clone();
     
     Arrays.sort(nums);
     //rotation
     for(int i=0;i<nums.length;i++)
     {
         int temp=nums[0];
         for(int j=0;j<nums.length-1;j++)
         {
            nums[j]=nums[j+1];
         }
         
             nums[nums.length-1]=temp;
            
            if(Arrays.equals(nums,arr))
            return true;
     }
     
     
     return false; 
    }
}

