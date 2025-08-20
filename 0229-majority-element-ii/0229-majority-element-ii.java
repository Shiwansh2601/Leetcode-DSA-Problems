class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int n=nums.length;
        List<Integer>res=new ArrayList<Integer>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int std=nums.length/3;
        for(int val:map.keySet())
        {
            if(map.get(val)>std)
            res.add(val);
        }
        return res;
    }
}