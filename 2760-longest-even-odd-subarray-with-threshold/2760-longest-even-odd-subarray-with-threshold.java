class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        int res=0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]%2==0 && nums[i]<=threshold)
            {  
                int curr=1;
               while(i+1<nums.length && nums[i]%2!=nums[i+1]%2 && nums[i+1]<=threshold)
               {
                curr++;
                res=Math.max(res,curr);
                i++;
               }

               res=Math.max(res,curr);
            }
            
            i++;
        }

    
        return res;
    }
}