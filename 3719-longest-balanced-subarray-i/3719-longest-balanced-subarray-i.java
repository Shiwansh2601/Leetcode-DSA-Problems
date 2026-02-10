class Solution {
    public int longestBalanced(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer>odd=new HashSet<>();
            Set<Integer>even=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                even.add(nums[j]);
                else
                odd.add(nums[j]);

                if(odd.size()==even.size())
                {
                    int curr=j-i+1;
                    max=Math.max(max,curr);
                }
            }
        }

        return max==Integer.MIN_VALUE?0:max;
    }
}