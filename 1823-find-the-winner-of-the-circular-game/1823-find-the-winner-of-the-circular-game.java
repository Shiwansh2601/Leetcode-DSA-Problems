class Solution {
    public int findTheWinner(int n, int k) {
        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=1;i<=n;i++)
        {
            dq.offer(i);
        }

        while(dq.size()>1)
        {
            for(int i=1;i<k;i++)
            {
                dq.offerLast(dq.pollFirst());
            }
            dq.pollFirst();
        }

        return dq.pollFirst();
    }
}