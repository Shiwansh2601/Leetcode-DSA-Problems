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
    List<String>ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        solve(root,new String());
        return ans;
    }

    public void solve(TreeNode root,String str)
    {
        if(root==null)
        return;

        if(root.left==null && root.right==null)
        {
            str=str+root.val;
            ans.add(str);
          
            return;
        }
        
        str=str+root.val+"->";
        solve(root.left,str);
        
        solve(root.right,str);


    }
}