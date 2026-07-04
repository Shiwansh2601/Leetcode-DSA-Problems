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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;

        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);

        int depth=1;
        while(!que.isEmpty())
        {
            int s=que.size();

            while(s>0)
            {
                TreeNode curr=que.poll();

                if(curr.left==null && curr.right==null)return depth;

                if(curr.left!=null)que.offer(curr.left);
                if(curr.right!=null)que.offer(curr.right);

                s--;
            }

            depth++;
        }

        return -1;
    }
}