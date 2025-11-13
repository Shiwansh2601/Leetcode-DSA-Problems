class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;

        ArrayList<Integer>res=new ArrayList<>();
        while(n>0)
        {
           res.add(n%2);
            n/=2;
        }

        for(int i=0;i<res.size()-1;i++)
        {
            if(res.get(i)==1)
            return false;
        }

        return true;
    }
}