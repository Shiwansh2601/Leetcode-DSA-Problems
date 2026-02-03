class Solution {
    List<String>res=new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        backtrack(digits,0,new StringBuilder());
        return res;
        
    }
    public void backtrack(String digits,int indx,StringBuilder str){
        //base case
        if(indx==digits.length())
        {
            res.add(str.toString());
            return;
        }
        
        String letters=Alphabet(digits.charAt(indx));
        
        for(char ch:letters.toCharArray())
        {
            str.append(ch);
            backtrack(digits,indx+1,str);
            str.deleteCharAt(str.length()-1);
        }
        
        
        
    }
    public String Alphabet(char ch)
    {
        if(ch == '2')
        {
            return "abc";
        }
        if(ch == '3')
        {
            return "def";
        }
        if(ch == '4')
        {
            return "ghi";
        }
        if(ch == '5')
        {
            return "jkl";
        }
        if(ch == '6')
        {
            return "mno";
        }
        if(ch == '7')
        {
            return "pqrs";
        }
        if(ch == '8')
        {
            return "tuv";
        }
        if(ch == '9')
        {
            return "wxyz";
        }
    
    return "";
}
}
