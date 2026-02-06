class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        
        if(nums.length==1||nums[0]*k>=nums[nums.length-1])
        return 0;


        int i=0;
        int j=0;
        int maxlen=0;
        int n=nums.length;
        while(i<n && j<n)
        {
            while(j<n && (long)nums[j]<=(long)k*nums[i])
            j++;

            maxlen=Math.max(maxlen,j-i);

            i++;


        }
       
       return n-maxlen;

    }
}