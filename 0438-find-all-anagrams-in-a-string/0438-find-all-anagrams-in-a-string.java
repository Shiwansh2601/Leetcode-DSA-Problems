class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer>list=new ArrayList<>();

        if(m>n)return list;

        int[] maps=new int[26];
        int[] mapp=new int[26];

        for(int i=0;i<m;i++)
        {
            int x=s.charAt(i)-'a';
            maps[x]++;

            int y=p.charAt(i)-'a';
            mapp[y]++;

        }

        if(Arrays.equals(maps,mapp))
        list.add(0);
        
        int j=m;
        int i=0;
        while(j<n)
        {
            int x=s.charAt(j)-'a';
            maps[x]++;
            j++;

            int y=s.charAt(i)-'a';
            maps[y]--;
            i++;

             if(Arrays.equals(maps,mapp))
                 list.add(i);
        }

        return list;
    }
}