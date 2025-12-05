class Solution {

    List<List<Integer>>res=new ArrayList<>();
    public void solve(int s,int k,int n,List<Integer>ans)
    {
        if(k==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
       
       if(s>n)
       return;

        for(int i=s;i<=n;i++)
        {
            ans.add(i);
            solve(i+1,k-1,n,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer>ans=new ArrayList<>();

        solve(1,k,n,ans);

        return res;
    }
}