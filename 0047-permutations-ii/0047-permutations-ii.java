class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void solve(int[] arr,int indx)
    {
        if(indx==arr.length)
        {
           List<Integer> list = new ArrayList<>();
             for (int x : arr) list.add(x);
            res.add(list);
            return;
        }
        
        HashSet<Integer>set=new HashSet<>();
        for(int i=indx;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            continue;

            set.add(arr[i]);
            
            swap(arr,i,indx);
            solve(arr,indx+1);
            swap(arr,i,indx);

        }
    }

    public void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        solve(nums,0);

        return res;
    }
}