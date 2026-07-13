class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();

        int i=0;
        while(i<tokens.length)
        { 
            String str=tokens[i];

            if(str.equals("+")||str.equals("-") ||str.equals("*")||str.equals("/"))
            {
                
                int a=st.pop();
                int b=st.pop();
                 int n=0;
                if(str.equals("+"))
                n=b+a;
                else if(str.equals("-"))
                n=b-a;
                else if(str.equals("*"))
                n=b*a;
                else 
                n=b/a;

                st.push(n);
            }
            else
            {
                st.push(Integer.parseInt(str));
            }

            i++;
        }

        return st.pop();
    }
}