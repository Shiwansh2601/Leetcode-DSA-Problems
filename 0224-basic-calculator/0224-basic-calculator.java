class Solution {
    public int calculate(String s) {
        int res=0;
        int num=0;
        int sign=1;
        Stack<Integer>stk=new Stack<>();
        int i=0;
        while(i<s.length())
        {   
          char c=s.charAt(i);

            if(c=='(')
            {
                stk.push(res);
                stk.push(sign);
                res=0;
                sign=1;
            }
            
            if(c==')')
            {    
                res=res+(num*sign);
                num=0;
                int presign=stk.pop();
                int preres=stk.pop();
                res=preres+(res*presign);
            }
            if(Character.isDigit(c))
            {
                num = num * 10 + (s.charAt(i) - '0');
            }
            if(c=='+')
            {
                res=res+(num*sign);
                num=0;
                sign=1;
            }

            if(c=='-')
            {   

                 res=res+(num*sign);
                num=0;
                sign=-1;
            }
             i++;
        }
          
          res=res+(num*sign);
        return res;
    }
}