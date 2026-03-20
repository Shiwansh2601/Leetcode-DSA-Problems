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
   static boolean check=true;
    public boolean isBalanced(TreeNode root) {
        check=true;
        solve(root);
        return check;
    }
    public int solve(TreeNode root){
        if(root==null)
        return 0;

        int lh=solve(root.left);
        int rh=solve(root.right);

        if(Math.abs(lh-rh)>1)
        check=false;

        return Math.max(lh,rh)+1;
    }

}