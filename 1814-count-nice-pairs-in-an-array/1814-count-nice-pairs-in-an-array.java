class Solution {


   public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long res=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=nums[i]-reverse(nums[i]);
            if(map.containsKey(k))
            {
               res=(res+map.get(k))%1000000007;
            }
            map.put(k,map.getOrDefault(k,0)+1);
        }
        return (int)res;
    }
}