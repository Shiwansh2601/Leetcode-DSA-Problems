class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int indx=nums.length-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
           if(nums[s]*nums[s]<=nums[e]*nums[e])
           {
            res[indx--]=nums[e]*nums[e];
            e--;
           }
           else
           {
            res[indx--]=nums[s]*nums[s];
            s++;
           }

        }
        return res;
    }
}