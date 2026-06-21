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
    TreeNode xpar;
    TreeNode ypar;
    int xlvl=-1;
    int ylvl=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        solve(root,null,0,x,y);

        return (xpar!=ypar)&&(xlvl==ylvl);
    }

    public void solve(TreeNode root,TreeNode par,int d,int x,int y)
    {

        if(root==null)return;


        if(root.val==x)
        {
            xpar=par;
            xlvl=d;
        }
        else if(root.val==y)
        {
            ypar=par;
            ylvl=d;
        }
        
        solve(root.left,root,d+1,x,y);
        solve(root.right,root,d+1,x,y);

    }
}