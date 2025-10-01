class Solution {
    public int calculate(String s) {
        int sum=0;
        int sign=1;
        Stack<Integer>stk=new Stack<>();
        int i=0;
        while(i<s.length())
        {   


            if(s.charAt(i)=='(')
            {
                stk.push(sum);
                stk.push(sign);
                sum=0;
                sign=1;
            }
            
            if(s.charAt(i)==')')
            {
                int presign=stk.pop();
                int preres=stk.pop();
                sum=preres+(sum*presign);
            }
            if(Character.isDigit(s.charAt(i)))
            {
                int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
            }
            i--;

            sum=sum+(num*sign);
            sign=1;
            }

            if(s.charAt(i)=='-')
            {
                sign=-1;
            }
             i++;
        }

        return sum;
    }
}