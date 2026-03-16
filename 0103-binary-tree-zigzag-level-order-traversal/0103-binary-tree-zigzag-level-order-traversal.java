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
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean rev=false;

        List<Integer> list = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {

                if(rev)
                {
                    Collections.reverse(list);

                }
                ans.add(new ArrayList<>(list));
                if (q.isEmpty()) {
                    break;
                } else {
                    list.clear();
                    rev=!rev;
                    q.add(null);
                    
                }
            } else {
               

                
                    list.add(curr.val);
                    if (curr.left != null) {
                        q.add(curr.left);
                       
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                        
                    }
                    

        
            }
        }

        return ans;
    }
}