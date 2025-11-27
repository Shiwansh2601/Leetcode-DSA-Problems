class Solution {
    public long maxSubarraySum(int[] nums, int k) {
       long[] prefix=new long[nums.length+1];
       prefix[0]=0L;
       for(int i=0;i<nums.length;i++)
       {
          prefix[i+1]=prefix[i]+nums[i];
       }

       long maxsum=Long.MIN_VALUE;
       int start=0;
       while(start<k)
       {
           long currsum=0L;

           int i=start;
           while(i<nums.length && i+k-1<nums.length)
           {
              int j=i+k-1;
              long subsum=prefix[j+1]-prefix[i];
              currsum=Math.max(subsum,subsum+currsum);
              maxsum=Math.max(maxsum,currsum);

              i=i+k;

           }
           start++;
       }
       return maxsum;
    }
}