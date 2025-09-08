class Solution {
    public int missingNumber(int[] nums) {
    
    int totalsum=((nums.length+1)*(nums.length))/2;
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
    }
        return totalsum-sum;  
    }
}