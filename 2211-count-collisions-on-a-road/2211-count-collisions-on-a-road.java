class Solution {
    public int countCollisions(String directions) {
        Stack<Character>st=new Stack<>();
        int count=0;
       int i=0;
       int j=directions.length()-1;

       while(i<=j && directions.charAt(i)=='L')
       {
        i++;
       }

        while(i<=j && directions.charAt(j)=='R')
       {
            j--;
       }

        while(i<=j)
       {
            if(directions.charAt(i)=='L' || directions.charAt(i)=='R')  
            count++;

            i++;
       }

       return count;
    }
}