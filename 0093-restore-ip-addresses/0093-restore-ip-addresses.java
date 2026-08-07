class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        
        if(s.length()>12)
        return ans;

        solve(s,0,0,new StringBuilder());
        return ans;
    }

    public void solve(String s,int i,int p,StringBuilder curr)
    {
        int n=s.length();
        if(i==n && p==4)
        {   
            curr.deleteCharAt(curr.length()-1);
            ans.add(curr.toString());
            return;
        }
        
        if(p>4)
        return;

        if(i == n && p != 4)
         return;

        if(i != n && p == 4)
         return;
        
        int len=curr.length();

        if(i+1<=n)
        {
            curr.append(s,i,i+1);
            curr.append('.');
            solve(s,i+1,p+1,curr);
            curr.setLength(len);
        }

        if(i+2<=n && isValid(s.substring(i,i+2)))
        {
            curr.append(s,i,i+2);
            curr.append('.');
            solve(s,i+2,p+1,curr);
            curr.setLength(len);
        }

        if(i+3<=n && isValid(s.substring(i,i+3)))
        {
           curr.append(s,i,i+3);
            curr.append('.');
            solve(s,i+3,p+1,curr);
            curr.setLength(len);
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