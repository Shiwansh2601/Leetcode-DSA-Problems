class KthLargest {
    
    int K;
   PriorityQueue<Integer>pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        K=k;
       for(int num:nums)
       {
           pq.add(num);

           if(pq.size()>K)
           pq.poll();
       }
    }
    
    public int add(int val) {
           pq.add(val);

           if(pq.size()>K)
           pq.poll();

        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */