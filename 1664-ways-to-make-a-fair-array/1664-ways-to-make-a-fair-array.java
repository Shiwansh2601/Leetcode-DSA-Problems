class Solution {
    public int waysToMakeFair(int[] nums) {
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            evensum+=nums[i];
            else
            oddsum+=nums[i];
        }

        int count=0;
        int prev=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                evensum=evensum-nums[i]+prev;
                if(oddsum==evensum)
                count++;
            }
            else
            {
                oddsum=oddsum-nums[i]+prev;
                if(oddsum==evensum)
                count++;
            }
            prev=nums[i];
        }

        return count;
    }
}