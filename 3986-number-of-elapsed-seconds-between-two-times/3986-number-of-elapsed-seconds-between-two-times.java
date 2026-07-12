class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        int h1=Integer.parseInt(endTime.substring(0,2));
        int m1=Integer.parseInt(endTime.substring(3,5));
        int s1=Integer.parseInt(endTime.substring(6,8));

        int endsec=(h1*(60*60))+(60*m1)+s1;

        int h2=Integer.parseInt(startTime.substring(0,2));
        int m2=Integer.parseInt(startTime.substring(3,5));
        int s2=Integer.parseInt(startTime.substring(6,8));

        int startsec=(h2*(60*60))+(60*m2)+s2;

        return endsec-startsec;

    }
}