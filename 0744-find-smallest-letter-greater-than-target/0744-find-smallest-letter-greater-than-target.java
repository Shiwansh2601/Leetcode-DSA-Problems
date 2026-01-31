class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        boolean flag = false;

        for(char ch : letters){
           if(ch>target)
           {
            res=ch;
            break;
           }
           
        }

        return res;
    }
    }