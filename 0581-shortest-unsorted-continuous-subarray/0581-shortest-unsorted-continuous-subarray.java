class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int l=0;
        int r=nums.length-1;

            int s=posL(l,r,nums);
            int e=posR(l,r,nums);
           
         int ans=0;
        while(s<e  && s>=0 && e<nums.length)
        {
            
            int[] pair=findminmax(s,e,nums);
            int min=pair[0];
            int max=pair[1];

            if(check(min,max,s,e,nums)==0)
            {
                return e-s+1;
            }
            else if(check(min,max,s,e,nums)==1)
            {
                 s--;
            }
            else
            {
                e++;
            }

            
        }

        return ans;
    }

    public int posL(int l,int r,int[] nums)
    {
        
            while(l<r && nums[l]<=nums[l+1])
            {
                l++;
            }

            return l;
    }

     public int posR(int l,int r,int[] nums)
    {
    

            while(l<r && nums[r]>=nums[r-1])
            {
                r--;
            }
            return r;
    }

    public int[] findminmax(int i,int n,int[] nums)
    {
            int max=-100001;
            int min=100001;
            
            while(i<=n)
            {
                if(nums[i]>max)
                max=nums[i];

                if(nums[i]<min)
                min=nums[i];

                i++;
            }
           

            int[] ans={min,max};

            return ans;
    }

    public int check(int min,int max,int s,int e,int[] nums)
    {
      

        int i=0;
        while(i<s && nums[i]<=min)
        {
            i++;
        }
        int j=e+1;

        while(j<nums.length && nums[j]>=max)
        j++;

        if(i==s && j==nums.length)
        return 0;
        else if(i==s)
        return 2;

        return 1;

    }
}