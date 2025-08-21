class MyQueue {

    Stack<Integer> stk1=new Stack<>();
    Stack<Integer> stk2=new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stk1.isEmpty())
        {
            int val=stk1.pop();
            stk2.push(val);
        }
        stk1.push(x);
        while(!stk2.isEmpty())
        {
            int val=stk2.pop();
            stk1.push(val);
        }
    }
    
    public int pop() {
        return stk1.pop();
    }
    
    public int peek() {
        return stk1.peek();
    }
    
    public boolean empty() {
        if(stk1.size()==0)
        return true;
        else
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */