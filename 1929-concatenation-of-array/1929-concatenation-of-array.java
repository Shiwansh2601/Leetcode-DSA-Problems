class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        int indx=0;
        int i=0;
        while(i<nums.length)
        {
            res[indx++]=nums[i++];
        }
         i=0;
        while(i<nums.length)
        {
            res[indx++]=nums[i++];
        }
        return res;
    }
}