class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0;
        int j=n;
        int indx=0;
        boolean check=true;
        while(indx<nums.length)
        {
            if(check)
            {
                res[indx]=nums[i];
                check=false;
                i++;
            }
            else{
                res[indx]=nums[j];
                check=true;
                j++;
            }
            indx++;
        }

        return res;
    }
}