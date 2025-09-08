class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int res=0;
        
        while(s<e)
        {
            int h=Math.min(height[s],height[e]);
            int w=e-s;
            res=Math.max(res,h*w);
            
            if(height[s]<height[e])
            s++;
            else
            e--;
        }
        return res;
    }
}