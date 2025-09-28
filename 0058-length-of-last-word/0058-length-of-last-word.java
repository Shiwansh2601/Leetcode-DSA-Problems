class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String res="";
        for(int i=str.length()-1;i>=0;i--)
        {     
           

           if(str.charAt(i)==' ')
              {
                return res.length();
              }
            res=res+str.charAt(i);
              
        }

        return res.length();
    }
}