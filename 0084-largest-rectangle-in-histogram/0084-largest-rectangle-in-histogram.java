class Solution {

     public int[] findnextsmaller(int[] arr)
    {
        int[] res=new int[arr.length];
         Stack<Integer>stk=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=-1;
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
            
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=-1;
            else
            res[i]=stk.peek();
            
            stk.push(i);
        }
        
        return res;
    }
    
    public int largestRectangleArea(int[] heights) {
         int n=heights.length;
        int[] indxofnext=findnextsmaller(heights);
        int maxarea=Integer.MIN_VALUE;
        int[] indxofprev=findprevsmaller(heights);
        for(int i=0;i<n;i++)
        {
           int l=heights[i];
           if(indxofnext[i]==-1)
           indxofnext[i]=n;
           
           int b=indxofnext[i]-indxofprev[i]-1;
           int area=l*b;
           maxarea=Math.max(area,maxarea);
        }
        
        return maxarea;
    }
}