class Solution {
    public int longestMountain(int[] nums) {
        
         int n=nums.length;
        
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                dp1[i]=dp1[i-1]+1;
            }
        }
        
        
        
         for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>nums[i+1])
            dp2[i]=dp2[i+1]+1;
        }
          
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(dp1[i]>1 && dp2[i]>1)
            max=Math.max(max,dp1[i]+dp2[i]-1);
        }

        return max;
    }
}