class Solution {
    public int minPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<j;i++,j--)
        {
            int a=nums[i];
            int b=nums[j];
             max=Math.max(a+b,max);
            
        }

        return max;
    }
}