class Solution {
    public char findTheDifference(String s, String t) {
        
        int sum1=0;
        int sum2=0;
        int i=0;
        for(i=0;i<s.length();i++)
        {
            sum1+=(int)s.charAt(i);
            sum2+=(int)t.charAt(i);
        }
        sum2+=(int)t.charAt(i);

        return (char)(sum2-sum1);
    }
}