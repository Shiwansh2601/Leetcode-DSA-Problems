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
    static int ans;
    static int n;
    public int kthSmallest(TreeNode root, int k) {
        ans=-1;
        n=k;
        solve(root);
        return ans;
    }

    public void solve(TreeNode root)
    {
        if(root==null)
        return;

        solve(root.left);

        n--;
        if(n==0)
        {
            ans=root.val;
        }
        solve(root.right);

    }
}