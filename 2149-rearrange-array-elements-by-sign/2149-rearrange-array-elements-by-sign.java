class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] even=new int[n/2];
        int[] odd=new int[n/2];
        int indx1=0;
        int indx2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
              even[indx1]=nums[i];
              indx1++;
            }
            else
            {
                odd[indx2]=nums[i];
                indx2++;
            }
        }

        indx1=0;
        indx2=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            {
                nums[i]=even[indx1];
                indx1++;
            }
            else
            {
                nums[i]=odd[indx2];
                indx2++;
            }
        }


        return nums;
    }
}