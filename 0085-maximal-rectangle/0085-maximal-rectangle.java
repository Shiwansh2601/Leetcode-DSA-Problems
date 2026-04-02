class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] nums=new int[m];
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int a=matrix[i][j]-'0';
                if(a==0)
                {
                    nums[j]=0;

                }
                else
                nums[j]+=1;
            }

            res=Math.max(res,solve(nums));
        }

        return res;
    }

    public int solve(int[] arr)
    {
        int n=arr.length;
        int[] temp1=new int[n];
        //NS element

        Stack<Integer>st1=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st1.isEmpty() && arr[i]<=arr[st1.peek()])
            {
                st1.pop();
            }

            if(st1.isEmpty())
            temp1[i]=n;
            else
            temp1[i]=st1.peek();

            st1.push(i);
        }


         int[] temp2=new int[n];
        //pS element

        Stack<Integer>st2=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st2.isEmpty() && arr[i]<=arr[st2.peek()])
            {
                st2.pop();
            }

            if(st2.isEmpty())
            temp2[i]=-1;
            else
            temp2[i]=st2.peek();

            st2.push(i);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int l=temp1[i]-temp2[i]-1;
            int curr=l*arr[i];
            max=Math.max(max,curr);
        }

        return max;
    }
}