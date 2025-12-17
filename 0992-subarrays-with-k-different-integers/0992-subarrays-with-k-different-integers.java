class Solution {
    public int subarrayAtmost(int[] nums,int k)
    {
        int count=0;
        int r=0;
        int l=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0)
                map.remove(nums[l]);
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count1=subarrayAtmost(nums,k);
        int count2=subarrayAtmost(nums,k-1);
        return count1-count2;
    }
}