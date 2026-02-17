class Solution {

    List<String>res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int left=n;
        int right=n;

        solve(left,right,new StringBuilder(),n);
        return res;
    }

    public void solve(int l,int r,StringBuilder str,int n){

     //base case
        if(str.length()==2*n)
        {
            res.add(str.toString());
            return;
        }

        if(l==r)
        {
            str.append('(');
            solve(l-1,r,str,n);
            str.deleteCharAt(str.length()-1);
        }
        else if(l==0 && r>0)
        {
            str.append(')');
            solve(l,r-1,str,n);
            str.deleteCharAt(str.length()-1);
        }
        else if(r>l)
        {
             str.append('(');
            solve(l-1,r,str,n);
            str.deleteCharAt(str.length()-1);
            str.append(')');
            solve(l,r-1,str,n);
            str.deleteCharAt(str.length()-1);


        }

    }
}