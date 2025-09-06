class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        HashSet<Character>set=new HashSet<>();
       int start=0;
       for(int i=0;i<s.length();i++)
       {     
        
         char input=s.charAt(i);
           while(set.contains(input))
           {
                set.remove(s.charAt(start));
                start++;
           }
           
               set.add(input); 
               int no=set.size();
               res=Math.max(no,res);
            
           
       }
       
       return res;
    }
}

