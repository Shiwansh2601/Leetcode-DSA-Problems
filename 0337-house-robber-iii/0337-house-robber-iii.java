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
 class Pair{
    int inc;
    int exc;

    Pair(int i,int e)
    {
        inc=i;
        exc=e;

    }
 }
class Solution {
    public int rob(TreeNode root) {
        Pair ans=helper(root);

        return Math.max(ans.inc,ans.exc);
    }

    public Pair  helper(TreeNode root){

        if(root==null)return new Pair(0,0);

        Pair lans=helper(root.left);
        Pair rans=helper(root.right);

        int myinc=root.val+lans.exc+rans.exc;
        int myexc=Math.max(lans.inc,lans.exc)+Math.max(rans.inc,rans.exc);


        return new Pair(myinc,myexc);
    }
}