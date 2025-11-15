class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty())
        {
            maxHeap.add(num);
            return;
        }

        if(maxHeap.peek()<num)
        {
            minHeap.add(num);
            if(minHeap.size()==maxHeap.size()+1)
            maxHeap.add(minHeap.poll());
        }
        else
        {
            maxHeap.add(num);
            if(maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        }
        
        
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size())
        return (double)maxHeap.peek();
        else
        return (minHeap.peek()+maxHeap.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */