class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]<=threshold)
            {
                int curr=1;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[j-1]%2!=nums[j]%2  && nums[j]<=threshold)
                     curr++;
                    else
                      break;
                }

                res=Math.max(res,curr);
            }
        }

        return res;
    }
}