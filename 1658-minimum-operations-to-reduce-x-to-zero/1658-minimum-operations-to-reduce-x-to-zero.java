class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }

        int target=sum-x;
        int ans=-1;
        int i=0;
        int csum=0;
        for(int j=0;j<nums.length;j++)
        {
            csum+=nums[j];

            while(csum>target && i<=j)
            {   
                csum-=nums[i++];
            }
           
           if(csum==target)
           ans=Math.max(ans,j-i+1);

        }

        if(ans==-1)
        return -1;

        return nums.length-ans;
    }
}