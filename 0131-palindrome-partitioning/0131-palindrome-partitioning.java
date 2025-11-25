class Solution {

    public void solve(String s,int idx,List<String>ans,List<List<String>>res)
    {   
        if(idx==s.length())
          {
            res.add(new ArrayList<>(ans));
            return;
          }
        for(int i=idx;i<s.length();i++)
        {   
            if(ispalindrom(s,idx,i))
            {
              ans.add(s.substring(idx,i+1));
              solve(s,i+1,ans,res);
              ans.remove(ans.size()-1);
            }
        }
    }
    public boolean ispalindrom(String s,int idx,int i)
    {
        String str=s.substring(idx,i+1);

        StringBuilder one=new StringBuilder(str);
        one.reverse();
        String str2=one.toString();

        return str.equals(str2);
    }
    public List<List<String>> partition(String s) {
        List<String>ans=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();
        solve(s,0,ans,res);


        return res;
    }
}