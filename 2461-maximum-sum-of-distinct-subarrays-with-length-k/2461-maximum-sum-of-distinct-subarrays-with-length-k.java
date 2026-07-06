class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long ans=0;
        long sum=0;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            sum+=(long)nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            if(j-i+1==k)
            {
                if(map.size()==k)
                ans=Math.max(ans,sum);
                
                 
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);

                if(map.get(nums[i])==0)
                map.remove(nums[i]);

                sum-=(long)nums[i];
                i++;
            }

            j++;
        }

        return ans;
    }
}