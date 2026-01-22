class Solution {
    public boolean sortcheck(LinkedList<Integer>list)
    {
         boolean flag=false;
         for(int i=0;i<list.size()-1;i++)
         {
             if(list.get(i)>list.get(i+1))
             {
                flag=true;
                break;
             }
         }
         return flag;
    }
    public int minimumPairRemoval(int[] nums) {
        boolean check=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            check=true;
        }
        if(check)
        {
           LinkedList<Integer> list= new LinkedList<>();
           for(int i=0;i<nums.length;i++)
           {
            list.add(nums[i]);
           } 
        int count=0;
        while(sortcheck(list))
        {
            int i=-1;
            int j=-1;
            int minsum=100000;
            for(int k=0;k<list.size()-1;k++)
            {
                if(list.get(k)+list.get(k+1)<minsum)
                {
                    i=k;
                    j=k+1;
                    minsum=list.get(k)+list.get(k+1);
                }
            }
            list.set(i,minsum);
            list.remove(j);
            count++;
        }

       return count;
  

        }
        else
        return 0;
    }
}