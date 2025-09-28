class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       int peri=0;
       for(int i=nums.length-1;i>=2;i--)
       {
           int x=nums[i];
           int y=nums[i-1];
           int z=nums[i-2];
           if((x+y)>z && (x+z)>y && (y+z)>x)
           {
            peri=x+y+z;
            return peri;
           }
       } 

       return peri;
    }
}