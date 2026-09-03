class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        

        // Initialization............
        int a=nums[0];

        if(n==1)return a;
        
        int b=Math.max(a,nums[1]);

        for(int i=2;i<n;i++)
        {
            int c=Math.max(nums[i]+a,b);

            a=b;
            b=c;
        }

        return b;
       
    }
}