class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length()-1;
        char[] str=s.toCharArray();
        while(j<=n)
        {
            char ch=str[j];
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()==3)
            {
                count+=n-j+1;
                char c=str[i];
                 map.put(c,map.getOrDefault(c,0)-1);
                 if(map.get(c)==0)
                 map.remove(c);

                 i++;
            }
            j++;

        }

        return count;
    }
}