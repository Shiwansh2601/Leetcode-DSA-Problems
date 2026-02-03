class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int n=intervals.length;

        if(n==1)
        return intervals;
        
        int num1=intervals[0][0];
        int num2=intervals[0][1];
        ArrayList<Integer>pair1=new ArrayList<>();
        pair1.add(num1);
        pair1.add(num2);
        list.add(pair1);

        for(int i=1;i<n;i++)
        {
            int s=list.size()-1;

            int a1=list.get(s).get(0);
            int a2=list.get(s).get(1);

            int b1=intervals[i][0];
            int b2=intervals[i][1];
            
            if(a2>=b1)
            {
                list.remove(s);
                ArrayList<Integer>pair=new ArrayList<>();
                pair.add(a1);
                pair.add(Math.max(a2,b2));
                list.add(pair);

            }
            else
            {
                ArrayList<Integer>pair=new ArrayList<>();
                pair.add(b1);
                pair.add(b2);
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