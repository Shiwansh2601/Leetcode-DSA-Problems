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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>stk1=new Stack<>();
        Stack<TreeNode>stk2=new Stack<>();
        if(root!=null)
        stk1.add(root);
        while(!stk1.isEmpty())
        {
            
            root=stk1.pop();
            stk2.add(root);
            if(root.left!=null)
            stk1.add(root.left);
            if(root.right!=null)
            stk1.add(root.right);
        }
        while(!stk2.isEmpty())
        {
            list.add(stk2.pop().val);
        }

        return list;
    }
}