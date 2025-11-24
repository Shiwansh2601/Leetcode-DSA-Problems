class Solution {
     List<List<Integer>>res=new ArrayList<>();
     Set<List<Integer>>set=new HashSet<>();

    public void solve(int[] arr,int indx)
    {
        if(indx==arr.length)
        {
           List<Integer> list = new ArrayList<>();
             for (int x : arr) list.add(x);
            if(set.add(list))
            res.add(list);
            return;
        }

        for(int i=indx;i<arr.length;i++)
        {
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
        Arrays.sort(nums);
        solve(nums,0);

        return res;
    }
}