class Solution {
    public int countValidSelections(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];
        }
        int ans=0;

        if(nums[0]==0)
        {
                    int lsum=0;
                    int rsum=prefix[nums.length-1]-prefix[0];

                    if(lsum==rsum)
                    ans+=2;

                    if(Math.abs(lsum-rsum)==1)
                    ans+=1;
        }
        for(int i=1;i<nums.length;i++)
        {
        
                if(nums[i]==0)
                {
                    int lsum=prefix[i-1];
                    int rsum=prefix[nums.length-1]-prefix[i];

                    if(lsum==rsum)
                    ans+=2;

                    if(Math.abs(lsum-rsum)==1)
                    ans+=1;
                }
            
        }

        return ans;
    }
}