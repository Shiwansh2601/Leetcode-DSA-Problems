class Solution {
    public boolean isTrionic(int[] nums) {
        boolean res = true;

        if (nums[0] >= nums[1])
            return false;

        int i = 0;
        int j = 1;
        int p = -1;
        int q = -1;

        while (j < nums.length) {

            if(nums[i]==nums[j])
            return false;

            if (nums[i] > nums[j]) {
                p = i;
                break;
            } else {
                i++;
                j++;
            }
        }
        if (p == -1)
            return false;

        while (j < nums.length) {

             if(nums[i]==nums[j])
            return false;

            if (nums[i] < nums[j]) {
                q = i;
                break;
            } else {

                i++;
                j++;
            }
        }

        if (q == -1)
            return false;
        
        while(j<nums.length)
        {
            if(nums[i]>=nums[j])
            return false;

            i++;
            j++;
        }
        return true;

    }
}