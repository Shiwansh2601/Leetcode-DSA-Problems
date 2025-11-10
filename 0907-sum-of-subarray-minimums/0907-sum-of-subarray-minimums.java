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
    public int sumSubarrayMins(int[] arr) {
        
        int n=arr.length;
        int[] indxofnext=findnextsmaller(arr);
        long ans=0;
        int[] indxofprev=findprevsmaller(arr);
        for(int i=0;i<n;i++)
        {
          
          
          int l=i-indxofprev[i];
          int r=indxofnext[i]-i;
          ans+=(long)l*r*arr[i];
          
        }
        long mod=1000000000+7;
        ans%=mod;
        return (int)ans;
    }
}