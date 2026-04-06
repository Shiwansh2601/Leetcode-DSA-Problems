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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;

        int ld=findheight(root.left);
        int rd=findheight(root.right);

        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        return Math.max(ld+rd,Math.max(d1,d2));
        
    }

    public int findheight(TreeNode root)
    {
        if(root==null)
        return 0;

        return Math.max(findheight(root.left),findheight(root.right))+1;
    }
}