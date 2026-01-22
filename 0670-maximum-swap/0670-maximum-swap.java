class Solution {
    public int maximumSwap(int num) {
        String str=Integer.toString(num);
        int n=str.length();
        int[] arr=new int[n];
        arr[n-1]=n-1;
        char max=str.charAt(n-1);
        for(int i=n-2;i>=0;i--)
        {
            if(str.charAt(i)>max)
            {
                arr[i]=i;
                max=str.charAt(i);
            }
            else
            arr[i]=arr[i+1];
        }

        StringBuilder sb = new StringBuilder(str);

       
      for(int i=0;i<n;i++)
      {
        if (sb.charAt(arr[i])>sb.charAt(i))
        {   char ch1=sb.charAt(arr[i]);
            char ch2=sb.charAt(i);

             sb.setCharAt(i,ch1);
             sb.setCharAt(arr[i],ch2);

             return Integer.valueOf(sb.toString());
        }
      }
       return num;

    }
}