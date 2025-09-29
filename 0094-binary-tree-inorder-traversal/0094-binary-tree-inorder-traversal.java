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

    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>stk=new Stack<>();
        while(!stk.isEmpty() ||root!=null)
        {
            if(root!=null)
            {
                stk.push(root);
                root=root.left;

            }
            else
            {
                root=stk.pop();
                list.add(root.val);
                root=root.right;

            }
        }


        return list;
    }
}