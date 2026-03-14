/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class Treeinfo{
        int ht;
        int diem;

        public Treeinfo(int h,int d)
        {
            this.ht=h;
            this.diem=d;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;


        return solve(root).diem-1;
    }

    public Treeinfo solve(TreeNode root)
    {
         if(root==null)
          return new Treeinfo(0,0);

        Treeinfo ls=solve(root.left);
         Treeinfo rs=solve(root.right);

         int lh=ls.ht;
         int rh=rs.ht;

         int d1=ls.diem;
         int d2=rs.diem;
         int d3=lh+rh+1;

         int d=Math.max(d3,Math.max(d1,d2));
         int h=Math.max(lh,rh)+1;
         return new Treeinfo(h,d);
        
    
    }
}