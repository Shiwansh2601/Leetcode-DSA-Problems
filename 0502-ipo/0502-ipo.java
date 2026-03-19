class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       int n=profits.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=profits[i];
            arr[i][1]=capital[i];

        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        PriorityQueue<int[]>max=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        int indx=0;
        while(indx<n && arr[indx][1]<=w)
        {
            max.add(new int[]{arr[indx][0],arr[indx][1]});
            indx++;
        }


        while(k>0 && !max.isEmpty())
        {
            int[] curr=max.poll();
            int  p=curr[0];
            int c=curr[1];
            w+=p;

          while(indx<n && arr[indx][1]<=w)
           {
            max.add(new int[]{arr[indx][0],arr[indx][1]});
            indx++;
           }

           k--;
            
        }

        return w;
    }
}