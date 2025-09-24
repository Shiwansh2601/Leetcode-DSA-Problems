class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[max])
            max=i;
        }
        return max;
    }
}