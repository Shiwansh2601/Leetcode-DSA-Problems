class MyCalendarThree {
    
   Map<Integer,Integer>map=new TreeMap<>();
   int res=0;

    public MyCalendarThree() {
    }
    
    public int book(int startTime, int endTime) {
       map.put(startTime,map.getOrDefault(startTime,0)+1);
       map.put(endTime,map.getOrDefault(endTime,0)-1);
       int count=0;
       for(int key:map.keySet())
       {
        count+=map.get(key);
        res=Math.max(res,count);
       }

       return res;
    }
}
