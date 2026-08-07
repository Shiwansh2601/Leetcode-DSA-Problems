class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        
        if(s.length()>12)
        return ans;

        solve(s,0,0,"");
        return ans;
    }

    public void solve(String s,int i,int p,String curr)
    {
        int n=s.length();
        if(i==n && p==4)
        {
            ans.add(curr.substring(0,curr.length()-1));
            return;
        }
        
        if(p>4)
        return;

        if(i == n && p != 4)
         return;

        if(i != n && p == 4)
         return;

        if(i+1<=n)
        {
            solve(s,i+1,p+1,curr+s.substring(i,i+1)+'.');
        }

        if(i+2<=n && isValid(s.substring(i,i+2)))
        {
            solve(s,i+2,p+1,curr+s.substring(i,i+2)+'.');
        }

        if(i+3<=n && isValid(s.substring(i,i+3)))
        {
            solve(s,i+3,p+1,curr+s.substring(i,i+3)+'.');
        }
    }

    public boolean isValid(String str)
    {
        if(str.length()>1 && str.charAt(0)=='0')
        return false;

        int n=Integer.parseInt(str);

        if(n>255)
        return false;


        return true;
    }
}