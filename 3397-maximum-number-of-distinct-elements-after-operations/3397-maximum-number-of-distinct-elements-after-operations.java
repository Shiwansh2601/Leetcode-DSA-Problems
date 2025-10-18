class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int assign=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int[] temp=new int[2];
            temp[0]=nums[i]-k;
            temp[1]=nums[i]+k;
            assign=Math.max(temp[0],last+1);
            if(assign<=temp[1])
           { count++;
             last=assign;
           }

        }
        return count;
    }
}