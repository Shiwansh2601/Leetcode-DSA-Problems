class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length()-1;
        while(j<=n)
        {
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()==3)
            {
                count+=n-j+1;
                char c=s.charAt(i);
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