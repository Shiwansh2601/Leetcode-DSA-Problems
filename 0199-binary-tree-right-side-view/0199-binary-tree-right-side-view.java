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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Set<Integer>set=new HashSet<>();

        solve(root,0,ans,set);

        return ans;
    }

    public void solve(TreeNode root,int l,List<Integer>ans,Set<Integer>set)
    {
        if(root==null)
        return ;


        if(!set.contains(l))
        {
            ans.add(root.val);
            set.add(l);
        }

        solve(root.right,l+1,ans,set);
        solve(root.left,l+1,ans,set);


    }
}