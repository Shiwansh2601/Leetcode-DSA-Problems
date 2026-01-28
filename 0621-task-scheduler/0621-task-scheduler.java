class Solution {
    public int leastInterval(char[] tasks, int n) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<tasks.length;i++)
       {
          map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);

       }
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:map.values())
       {
        pq.add(num);

       }

       int time=0;
       while(!pq.isEmpty())
       {
        int cycle=n+1;
        ArrayList<Integer>temp=new ArrayList<>();
        while(cycle>0 && !pq.isEmpty())
        {
            int curr=pq.poll();
            curr--;
            if(curr>0)
            temp.add(curr);

            time++;
            cycle--;
        }

        for(int num:temp)
        {
            pq.add(num);
        }

        if(!pq.isEmpty())
        time+=cycle;

       }

       return time;
    }
}