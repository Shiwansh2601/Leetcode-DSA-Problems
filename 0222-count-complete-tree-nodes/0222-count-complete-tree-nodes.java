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
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

       int lh=lefth(root.left);
       int rh=righth(root.right);
       
       if(lh==rh)
       {
           return (int)Math.pow(2,lh+1)-1;
       }
       else
       {
           int lc=countNodes(root.left);
           int rc=countNodes(root.right);
           
           return lc+rc+1;
       }
    }

    public int lefth(TreeNode root)
    {
        if(root==null)
        return 0;
        
        return lefth(root.left)+1;
    }
    
    public int righth(TreeNode root)
    {
        if(root==null)
        return 0;
        
        return righth(root.right)+1;
    }
}