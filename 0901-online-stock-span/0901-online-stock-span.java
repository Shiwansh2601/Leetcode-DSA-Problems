class StockSpanner {
    int i=0;
    Stack<int[]>stk=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int res=0;
        if(stk.isEmpty())
        {
            res=i+1;
            stk.push(new int[]{price,i++});
            return res;
        }
        else
        {
            while(!stk.isEmpty() && stk.peek()[0]<=price)
              stk.pop();
            

            if(stk.isEmpty())
               res=i+1;
            else   
               res=i-stk.peek()[1];

            stk.push(new int[]{price,i++});
            return res;  
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */