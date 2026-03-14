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
    int res=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)
        return 0;

        solve(0,root);
        return res;

    }

    public void solve(int prev,TreeNode root){
        
        if(root==null)
        return;

        if(root.left==null && root.right==null)
        { 
            prev=prev*10+root.val;
            res=res+prev;
          return;
        }

        prev=prev*10+root.val;
        solve(prev,root.left);
        solve(prev,root.right);
    }
}