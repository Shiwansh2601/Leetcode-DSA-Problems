class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int len=0;
        boolean check=false;

        for(int n:map.values())
        {
            if(n%2==0)
            len+=n;
            else
            {
                len+=(n-1);
                check=true;
            }

        }

        if(check)
        return len+1;

        return len;
    }
}