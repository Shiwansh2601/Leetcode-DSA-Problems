class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(1,k,n,new ArrayList<>());
        return res;
    }
    public void solve(int d,int k,int sum,ArrayList<Integer>list){
        if(sum==0 && k==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }

        if(k<0 || sum<0||d>9)
        return;

        list.add(d);
        solve(d+1,k-1,sum-d,list);
        list.remove(list.size()-1);
         solve(d+1,k,sum,list);

    }
}