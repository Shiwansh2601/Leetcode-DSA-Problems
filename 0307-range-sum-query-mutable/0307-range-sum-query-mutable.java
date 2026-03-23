class NumArray {
   
   static int[] segtree;
  static int N;
    public NumArray(int[] nums) {
        int n=nums.length;
        N=n;
        segtree=new int[4*n];

        build(1,nums,0,n-1);
        
    }
    
  public  static void build(int v,int[] nums,int tl,int tr)
    {
        if(tl==tr)
        {
            segtree[v]=nums[tl];
            return;
        }

        int tm=(tl+tr)/2;
        build(2*v,nums,tl,tm);
        build(2*v+1,nums,tm+1,tr);

        segtree[v]=segtree[2*v]+segtree[2*v+1];
    }
    public void update(int index, int val) {
        qupdate(1,0,N-1,index,val);
    }

    public static void qupdate(int v,int tl,int tr,int i,int val){
        if(tl==tr)
        {
            segtree[v]=val;
            return;
        }

        int tm=(tl+tr)/2;
        if(i<=tm)
        {
            qupdate(2*v,tl,tm,i,val);
        }
        else
        {
            qupdate(2*v+1,tm+1,tr,i,val);
        }

        segtree[v]=segtree[2*v]+segtree[2*v+1];
    }
    
    public int sumRange(int left, int right) {
        return query(1,0,N-1,left,right);
    }

   public static int query(int v,int tl,int tr,int l,int r){

        if(tr<l ||r<tl)
        return 0;

        if(tl>=l && tr<=r)
        return segtree[v];

        int tm=(tl+tr)/2;
       int left= query(2*v,tl,tm,l,r);
       int right= query(2*v+1,tm+1,tr,l,r);
       return left+right;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */