class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
    long total=(long)(n*(n-1))/2;
        long good=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int k=nums[i]-i;
               if(map.containsKey(k))
               {
                   good+=map.get(k);
               }

            map.put(k,map.getOrDefault(k,0)+1);
        }

        return (long)total-good;

    }
}