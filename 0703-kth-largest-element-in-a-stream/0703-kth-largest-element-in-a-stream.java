class KthLargest {
    
    int K;
    ArrayList<Integer>arr=new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i=0;i<nums.length;i++)
        {
            arr.add(nums[i]);
        }
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */