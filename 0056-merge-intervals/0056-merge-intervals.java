class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int n=intervals.length;

        if(n==1)
        return intervals;
        if(intervals[0][1]>=intervals[1][0])
        {
             int a=intervals[0][0];
              int b=Math.max(intervals[1][1],intervals[0][1]);
              ArrayList<Integer>pair=new ArrayList<>();
              pair.add(a);
              pair.add(b);
              list.add(pair);
        }
        else
        {
            int a=intervals[0][0];
              int b=intervals[0][1];
              ArrayList<Integer>pair=new ArrayList<>();
              pair.add(a);
              pair.add(b);
              list.add(pair);

              int a1=intervals[1][0];
              int b1=intervals[1][1];
              ArrayList<Integer>pair1=new ArrayList<>();
              pair1.add(a1);
              pair1.add(b1);
              list.add(pair1);
        }
        
        for(int i=2;i<n;i++)
        {
           if(intervals[i-1][1]>=intervals[i][0])
           {
              int a=intervals[i-1][0];
              int b=Math.max(intervals[i-1][1],intervals[i][1]);
              ArrayList<Integer>pair=new ArrayList<>();
              pair.add(a);
              pair.add(b);
              list.add(pair);
           }
           else
           {
               int a=intervals[i][0];
              int b=intervals[i][1];
              ArrayList<Integer>pair=new ArrayList<>();
              pair.add(a);
              pair.add(b);
              list.add(pair);
           }
        }

        int row=list.size();
        int col=2;
        int[][] res=new int[row][col];
        for(int i=0;i<list.size();i++)
        {
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }
        return res;
    }
}