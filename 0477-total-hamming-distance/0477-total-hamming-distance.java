class Solution {
    public int totalHammingDistance(int[] nums) {
        
        int sum=0;
        for(int i=0;i<=31;i++)
        {
            int mask=1<<i;
            int one=0;
            int zero=0;
            for(int j=0;j<nums.length;j++)
            {
                if((mask&nums[j])>0)
                one++;
                else
                zero++;
            }

            sum+=(zero*one);
        }

        return sum;
    }

   
}