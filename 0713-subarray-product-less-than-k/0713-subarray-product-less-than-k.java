class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k==0)
        return 0;
        int n=nums.length;

        int count=0;
        long psum=1L;
        int i=0;

        for(int j=0;j<n;j++)
        {
             psum*=nums[j];

             while(psum>=k && i<=j)
             {
                psum/=nums[i++];
             }

             count+=(j-i+1);
        }

        return count;
    }
}