class Solution {
    public int countPartitions(int[] nums) {
       int n=nums.length;
       for(int i=1;i<n;i++)
       {
         nums[i]=nums[i]+nums[i-1];
       }
    
       int total=nums[n-1];
       int count=0;
       for(int i=0;i<n-1;i++)
       {
         int l=nums[i];
         int r=total-l;
         int d=r-l;
         if(d%2==0)
         count++;
       }

      return count;
    }
}