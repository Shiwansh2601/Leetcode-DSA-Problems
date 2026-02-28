class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jump=0;
        int l=0;
        int r=0;
        while(r<n)
        {
            int max=0;
            for(int i=l;i<=r;i++)
            {
                if(nums[i]+i>max)
                max=nums[i]+i;
            }
            jump++;

            l=r+1;
            r=max;

            if(r>=n-1)
            return jump;

        }

        return jump;
       
    }

   
}