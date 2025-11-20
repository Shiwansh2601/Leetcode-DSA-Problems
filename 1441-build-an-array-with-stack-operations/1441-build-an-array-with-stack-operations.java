class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>res=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:target)
        {
            set.add(num);
        }
        
        int val=1;
        int i=0;
        while(i<target.length)
        {
            if(set.contains(val))
            {
                res.add(new String("Push"));
                i++;
            }
            else
            {
                res.add(new String("Push"));
                res.add(new String("Pop"));
            }
            val++;
        }

        return res;
    }
}