class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character>stk1=new Stack<>();
        Stack<Character>stk2=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
               if(!stk1.isEmpty())
                stk1.pop();
            }
            else
            {
                stk1.push(s.charAt(i));
            }
            
        }

        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
               if(!stk2.isEmpty())
                stk2.pop();
            }
            else
            {
                stk2.push(t.charAt(i));
            }
            
        }


        if(stk1.size()!=stk2.size())
        return false;

        while(!stk1.isEmpty() && !stk2.isEmpty())
        {
            if(stk1.pop()!=stk2.pop())
            return false;
        }
        return true;
    }
}