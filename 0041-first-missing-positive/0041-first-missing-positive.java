class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums)
        {
            if(n>0)
            set.add(n);


        }

        int ans=1;
        while(set.contains(ans))
        ans++;

        return ans;
    }
}