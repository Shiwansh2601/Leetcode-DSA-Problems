class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int n=asteroids[i];
            boolean isalive=true;

            while(isalive && !stk.isEmpty() && n<0 && stk.peek()>0 )
            {
                if(stk.peek()<-n)
                stk.pop();
                else if(stk.peek()==-n)
                {
                    stk.pop();
                    isalive=false;
                }
                else
                isalive=false;
            }

            if(isalive)
            stk.push(n);
        }

        int n=stk.size();
        int[] res=new int[n];

        for(int i=n-1;i>=0;i--)
        {
            res[i]=stk.pop();
        }

        return res;
    }
}