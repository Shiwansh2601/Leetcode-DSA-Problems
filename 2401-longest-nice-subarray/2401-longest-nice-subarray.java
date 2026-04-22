class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int max=0;

        int i=0;
        int j=0;
        int mask=0;
        while(j<nums.length)
        {    
            
             while((mask & nums[j]) !=0  && i<=j)
             {
                mask ^=nums[i++];
             }

             max=Math.max(max,j-i+1);

             mask |=nums[j];

             j++;
           
              
        }

        return max;
    }

    
}