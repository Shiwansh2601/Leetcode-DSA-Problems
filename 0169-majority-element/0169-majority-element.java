class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int res=0;
        for(int val:map.keySet())
        {
            if(map.get(val)>max)
            {   
                max=map.get(val);
                res=val;
            }

        }

        return res;
    }
}