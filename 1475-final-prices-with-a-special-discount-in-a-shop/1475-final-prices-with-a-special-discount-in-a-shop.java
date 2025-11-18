class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int discount[]=new int[n];
        Stack<Integer>stk=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && prices[i]<stk.peek())
            {
                stk.pop();
            }

            if(stk.isEmpty())
              discount[i]=0;
            else
              discount[i]=stk.peek();

            stk.push(prices[i]);
        }

        for(int i=0;i<n;i++)
        {
            prices[i]=prices[i]-discount[i];
            
        }

        return prices;

    }
}