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
       
        ans.add(s);
        solve(s+1,k-1,n,ans);
        ans.remove(ans.size()-1);
        solve(s+1,k,n,ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer>ans=new ArrayList<>();

        solve(1,k,n,ans);

        return res;
    }
}