class Solution {
    public int jump(int[] nums) {
        int count=0;
        int n=nums.length;
        int maxreach=0;
        int l=0;
        int r=0;

        while(l<n && r!=n-1)
        {
            int curr=0;

            while( l<n && l<=r)
            {
                if((nums[l]+l)>curr)
                curr=nums[l]+l;

                l++;
            }
            if(curr>maxreach)
            {
                 count++; 
                 maxreach=curr;

                 if(maxreach>=n-1)
                 return count;
            }
          
            r=curr;
        }

        return count;
    }
}