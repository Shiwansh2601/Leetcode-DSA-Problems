class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n=arr.length;
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a,b)->Double.compare(b[0], a[0])
            );

            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    double div=(double)arr[i]/arr[j];
                    pq.add(new double[]{div,(double)arr[i],(double)arr[j]});

                    if(pq.size()>k)
                    pq.poll();
                }
            }

            double[] top=pq.peek();
            int[] res={(int)top[1],(int)top[2]};
            return res;
    }
}