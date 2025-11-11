class Solution {
     public int[] findnextsmaller(int[] arr)
    {
        int[] res=new int[arr.length];
         Stack<Integer>stk=new Stack<>();
        int n=arr.length;
        for(int i=arr.length-1;i>=0;i--)
        {
            
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=n;
            else
            res[i]=stk.peek();
            
            stk.push(i);
            
        }
        
        return res;
    }
    
     public  int[] findprevsmaller(int[] arr)
    {
         int[] res=new int[arr.length];
         Stack<Integer>stk=new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            while(!stk.isEmpty() && arr[i]<arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=-1;
            else
            res[i]=stk.peek();
            
            stk.push(i);
        }
        
        return res;
    }

    public int countone(int[] arr)
    {
         int n=arr.length;
        int[] indxofnext=findnextsmaller(arr);
        int ans=0;
        int[] indxofprev=findprevsmaller(arr);
        for(int i=0;i<n;i++)
        {
          
          
          int l=i-indxofprev[i];
          int r=indxofnext[i]-i;
          ans+=l*r*arr[i];
          
        }
       
        return ans;
    }
    public int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int[] height=new int[m];
        int sum=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                height[j]+=1;
                else
                height[j]=0;
            }

            sum+=countone(height);
        }

        return sum;
    }
}