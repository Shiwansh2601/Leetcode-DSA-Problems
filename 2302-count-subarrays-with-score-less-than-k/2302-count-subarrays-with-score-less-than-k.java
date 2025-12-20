class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0L;
        long sum=0L;
        long product=0L;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
             sum+=(long)nums[j];
             product=sum*(j-i+1);
             while(product>=k && i<nums.length)
             {
                sum-=(long)nums[i];
                i++;
                product=sum*(j-i+1);
             }
             count+=(j-i+1);
             j++;
        }
      
      return count;
    }
}