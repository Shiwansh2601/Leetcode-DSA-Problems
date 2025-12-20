class CustomStack {
    
    Stack<Integer>st=new Stack<>();
    int maxsize;
    public CustomStack(int maxSize) {
        maxsize=maxSize;
    }
    
    public void push(int x) {
        if(st.size()>=maxsize)
        return;

        st.push(x);

    }
    
    public int pop() {
        if(st.isEmpty())
        return -1;
        
        
        return st.pop();

    }
    
    public void increment(int k, int val) {
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty())
        {
            temp.push(st.pop());
        }

        if(k>temp.size())
        k=temp.size();
        
        while(k>0)
        {
            st.push(temp.pop()+val);
            k--;
        }

        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }



    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */