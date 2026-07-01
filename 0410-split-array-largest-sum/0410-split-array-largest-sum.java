class Solution {
    public int splitArray(int[] nums, int k) {


        int l=nums[0];
        int r=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>l)
            l=nums[i];

            r+=nums[i];
        }

        int ans=0;
        while(l<=r)
        {
            int mid=(l+r)/2;

            if(pos(mid,nums,k))
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                 l=mid+1;
            }

        }

        return ans;
    }

    public boolean pos(int max,int[] nums,int k)
    {
        int team=1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];

           if(sum>max)
           {
                team++;
                sum=nums[i];
           }
          
           
           
        }


        return team<=k;
    }
}