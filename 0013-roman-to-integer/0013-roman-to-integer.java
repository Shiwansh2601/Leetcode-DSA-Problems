class Solution {

    public int chartoint(char ch)
    {
        if(ch=='I')
        {
            return 1;
        }
        else if(ch=='V')
        {
            return 5;
        }
         else if(ch=='X')
        {
            return 10;
        }
         else if(ch=='L')
        {
            return 50;
        }
         else if(ch=='C')
        {
            return 100;
        }
         else if(ch=='D')
        {
            return 500;
        }
        else if(ch=='M')
        {
            return 1000;
        }
        else 
        {
            return 0;
        }
    }
    public int romanToInt(String s) {
          
          int sum=0;
          for(int i=0;i<s.length();i++)
          {
            if(i==s.length()-1)
            {
                sum=sum+chartoint(s.charAt(i));
            }
            else 
            {
                if(chartoint(s.charAt(i))>=chartoint(s.charAt(i+1)))
                {
                    sum=sum+chartoint(s.charAt(i));
                }
                else
                {
                    sum=sum+chartoint(s.charAt(i+1))-chartoint(s.charAt(i));
                    i++;
                }
            }
          }
          return sum;
    }
}