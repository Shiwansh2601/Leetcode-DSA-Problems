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
    StringBuilder str=new StringBuilder();
    public String tree2str(TreeNode root) {
        solve(root,str);
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    public void solve(TreeNode root,StringBuilder str)
    {
        if(root==null)
         {
            str.deleteCharAt(str.length()-1);
            return;
         }
        
        str.append(root.val);

        if(root.left==null && root.right!=null)
        {
            str.append('(');
            str.append(')');
        }

       str.append('(');
       solve(root.left,str);
       str.append('(');
       solve(root.right,str);

       str.append(')');
        
    }
}