class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res=new ArrayList<>();
     
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++)
      {
        int l=i+1;
        int r=nums.length-1;
        if(i>0 && nums[i]==nums[i-1])
        {
            continue;
        }
        else
        {
        while(l<r)
        {
            int sum=nums[i]+nums[l]+nums[r];
            if(sum==0)
            {

            List<Integer> triplet=new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(nums[l]);
            triplet.add(nums[r]);
            res.add(triplet);
            l++;
            r--;

            while(l<r && nums[l]==nums[l-1])
            {
                l++;
            }

            while(l<r && nums[r]==nums[r+1])
            {
                r--;
            }
            }
            else if(sum<0)
            l++;
            else
            r--;
        }
        
        }

      }  

     return res;
    }
}