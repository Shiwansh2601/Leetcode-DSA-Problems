class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count =0;
        int csum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {  csum+=nums[i];
            int comp = ((csum % k) + k) % k;

            if(map.containsKey(comp))
            count+=map.get(comp);

            map.put(comp,map.getOrDefault(comp,0)+1);
        }

        return count;
    }
}