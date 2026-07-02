class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        if (nums.isEmpty())
            return 0;

        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int sum=0;
        int max=0;

        int i=0;
        int j=0;

        while(j<nums.size())
        {
            int x=nums.get(j);
            map.put(x,map.getOrDefault(x,0)+1);
            sum++;
            if(map.get(x)>max)
            max=map.get(x);

            while(sum-max>k)
            {   
                int y=nums.get(i);
                 map.put(y,map.getOrDefault(y,0)-1);

                 if(map.get(y)==0)
                 map.remove(y);

                 sum--;
                 i++;
            }

            ans=Math.max(max,ans);
            j++;
        }

        return ans;
    }
}