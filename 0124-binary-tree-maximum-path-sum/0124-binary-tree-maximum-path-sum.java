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

    int rtn;
    int ntn;

    Pair(int r,int n){
        rtn=r;
        ntn=n;
    }
 }
class Solution {
    public int maxPathSum(TreeNode root) {
        
        Pair ans=solve(root);
        return Math.max(ans.rtn,ans.ntn);

       
       
    }


    public Pair solve(TreeNode root){

        if(root==null)return new Pair(0,Integer.MIN_VALUE);

        Pair lans=solve(root.left);
        Pair rans=solve(root.right);

        int myrtn=Math.max(Math.max(lans.rtn+root.val,rans.rtn+root.val),root.val);
        int myntn=Math.max(Math.max(lans.ntn,rans.ntn),Math.max(root.val+lans.rtn+rans.rtn,myrtn));

        return new Pair(myrtn,myntn);

        
    }
}