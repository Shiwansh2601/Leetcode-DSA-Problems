class NumArray {
     
     int[] presum;
    public NumArray(int[] nums) {
        int n=nums.length;
        presum=new int[n];
        presum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            presum[i]=nums[i]+presum[i-1];
        }

    }
    
    public int sumRange(int left, int right) {
        int r=presum[right];
        int l=left==0?0:presum[left-1];
        return r-l;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */