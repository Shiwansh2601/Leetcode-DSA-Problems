class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long ans=0;
        long sum=0;
        int i=0;
        int j=0;
        while(j<nums.size())
        {
            int num=nums.get(j);
            sum+=(long)num;
            map.put(num,map.getOrDefault(num,0)+1);

            if(j-i+1==k)
            {
                if(map.size()>=m)
                ans=Math.max(ans,sum);
                
                int n=nums.get(i);
                map.put(n,map.getOrDefault(n,0)-1);

                if(map.get(n)==0)
                map.remove(n);

                sum-=(long)n;
                i++;
            }

            j++;
        }

        return ans;
    }
}