class Solution {
    List<Integer>list=new ArrayList<>();
    public int lengthOfLIS(int[] nums) {

       for(int i=0;i<nums.length;i++)
       {
           int l_indx=lowerBound(nums[i]);

           if(l_indx==-1)
           {
             list.add(nums[i]);
           }
           else
           {
               list.set(l_indx,nums[i]);
           }
       }

       return list.size();
    }

    public int lowerBound(int n)
    {
        if(list.size()==0)
        return -1;

        int ans=-1;

        int l=0;
        int r=list.size()-1;

        while(l<=r)
        {
            int mid=(l+r)/2;

            if(list.get(mid)>=n)
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
}