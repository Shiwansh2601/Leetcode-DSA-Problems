class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long x=0;
        List<Boolean>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            x=(2*x)+nums[i];

            if(x%5==0)
              res.add(true);
            else
              res.add(false);
            
        }
        return res;
    }
}