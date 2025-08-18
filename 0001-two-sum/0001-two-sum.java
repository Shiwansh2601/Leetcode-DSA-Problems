class Solution {
    public int[] twoSum(int[] nums, int target) {
    int num[] = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        int comp = target - nums[i];
        if(map.containsKey(comp))
        {
            num[0]=i;
            num[1]=map.get(comp);
            return num;
        }
        else
        {
            map.put(nums[i],i);
        }
    }
     
     return num;
     
     }
}