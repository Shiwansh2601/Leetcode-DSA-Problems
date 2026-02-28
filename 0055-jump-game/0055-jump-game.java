class Solution {
    public boolean canJump(int[] nums) {
        int m=nums.length-1;
        int last=0;
        int i=0;
        while(i<=m)
        {
             last=Math.max(last,i+nums[i]);
            if(last>=m)
            return true;
            
            if(i==last)
            return false;

           
            i++;

        }
        
        return true;
    }

   
}