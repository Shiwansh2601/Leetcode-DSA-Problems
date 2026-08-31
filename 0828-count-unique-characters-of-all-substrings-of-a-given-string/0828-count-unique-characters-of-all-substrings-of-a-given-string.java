class Solution {
    public int uniqueLetterString(String s) {
        List<List<Integer>>list=new ArrayList<>();

        int n=s.length();
        for(int i=0;i<26;i++)
        {
            list.add(new ArrayList<>());
            list.get(i).add(-1);
        }

        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'A';
            list.get(idx).add(i);
        }

        for(int i=0;i<26;i++)
        {
            list.get(i).add(n);
        }

        int ans=0;
        for(int i=0;i<26;i++)
        {
            int size=list.get(i).size();
            for(int j=1;j<size-1;j++)
            {
                int a=list.get(i).get(j-1);
                int x=list.get(i).get(j);
                int b=list.get(i).get(j+1);
                  ans+= (x-a)*(b-x);
            }
        }


        return ans;
    }
}