class Solution {
    static{
        for(int i =0;i<500;i++){
            findMaxConsecutiveOnes(new int[]{});
        }
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        for(int num:nums)
        {
            if(num==1)
            {
                count++;
            }
            else
            {
                max=Math.max(count,max);
                count=0;
            }
           
        }
        max=Math.max(count,max);
        return max;
    }
}