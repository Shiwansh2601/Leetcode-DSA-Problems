class MyCalendar {
    
    ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        if(arr.isEmpty())
        {
            ArrayList<Integer>pair=new ArrayList<>();
            pair.add(startTime);
            pair.add(endTime);
            arr.add(pair);

            return true;
        }

        for(int i=0;i<arr.size();i++)
        {
            if(startTime<arr.get(i).get(1)  && endTime>arr.get(i).get(0) )
            return false;

        }
        ArrayList<Integer>pair=new ArrayList<>();
            pair.add(startTime);
            pair.add(endTime);
            arr.add(pair);

            return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */