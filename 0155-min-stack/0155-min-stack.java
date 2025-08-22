class MinStack {
  

   Stack<Integer>stk1=new Stack<>();
   Stack<Integer>stk2=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
       stk1.add(val);
       if(stk2.isEmpty() || val<=stk2.peek())
       stk2.add(val); 
    }
    
    public void pop() {
       int poped=stk1.pop();
       if(poped==stk2.peek())
       stk2.pop();
     
    }
    
    public int top() {
        return stk1.peek();
    }
    
    public int getMin() {
        return stk2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */