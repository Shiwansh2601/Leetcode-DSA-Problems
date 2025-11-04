class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int key:nums)
        {
            map.put(key,map.getOrDefault(key,0)+1);
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->a[1]-b[1]
        );

        for(int key:map.keySet())
        {  
            int val=map.get(key);
            pq.add(new int[]{key,val});

            if(pq.size()>k)
            pq.poll();
        }

        int[] res=new int[k];
        int indx=0;

        while(!pq.isEmpty())
        {
            int[] curr=pq.poll();

            res[indx++]=curr[0];
        }

        return res;
    }
}