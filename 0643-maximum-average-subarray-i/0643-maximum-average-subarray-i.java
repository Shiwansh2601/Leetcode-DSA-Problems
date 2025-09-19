class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=0;
        double sum=0;
        double max=Integer.MIN_VALUE;
     
        while(end<k)
        {
            sum +=nums[end];
            end++;

        }
        max=Math.max(max,sum);

        while(end<nums.length)
        {
            sum+=nums[end];
            sum-=nums[start];
            start++;
            end++;
            max=Math.max(max,sum);
        }

        return max/k;
    }
}