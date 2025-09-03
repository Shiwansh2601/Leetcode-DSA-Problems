class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                count0++;    
            }
            else if(nums[i] == 1)
            {
                count1++;
            }
            else 
            {
                count2++;
            }
            
        } 
        int indx=0;
        while(count0>0)
        {
            nums[indx]=0;
            indx++;
            count0--;
        }
        
         while(count1>0)
        {
            nums[indx]=1;
            indx++;
            count1--;
        }
        
         while(count2>0)
        {
            nums[indx]=2;
            indx++;
            count2--;
        }
    }
}