class MyCircularQueue {
    int size;
    int front =-1;
    int rear=-1;
    int[] queue;
    public MyCircularQueue(int k) {
        size=k;
        queue=new int[size];
    }
   
    public boolean enQueue(int value) {
       if((front==0 && rear==size-1) || front==rear+1)
       return false;

       if(front==-1)
       front=0;
       
        if(rear==size-1)
        rear=0;
        else
        rear++;

       queue[rear]=value;
       return true;

    }
    
    public boolean deQueue() {
        if(front==-1)
        return false;

        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            if(front==size-1)
            front=0;
            else
            front++;
        }
        return true;
    }
    
    public int Front() {
        if(front==-1)
        return -1;

        return queue[front];
    }
    
    public int Rear() {
        if(front==-1)
        return -1;

        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return ((front==0 && rear==size-1) || front==rear+1);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */