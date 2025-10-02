class Solution {
    public int calPoints(String[] operations) {
        int total=0;
        Stack<Integer>stk=new Stack<>();
        for(String s:operations)
        {   
            char ch=s.charAt(0);
            int sign=1;
            if(ch!='D' && ch!='+' && ch!='C')
            {
                int num=0;
                int i=0;
                while(i<s.length())
                {
                    if(s.charAt(i)=='-')
                    sign=-1;
                    else
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                
                stk.push(num*sign);
            }
            
            else if(ch=='C')
            stk.pop();
            else if(ch=='+')
            {
                int n1=stk.pop();
                int n2=stk.peek();
                int sum=n1+n2;
                stk.push(n1);
                stk.push(sum);
            }
            else if(ch=='D')
            {
                int x=stk.peek();
                stk.push(2*x);
            }
        }

        while(!stk.isEmpty())
        {
            total+=stk.pop();
        }

        return total;
    }
}