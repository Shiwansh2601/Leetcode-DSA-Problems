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
    int max=0;
    List<TreeNode>path=new ArrayList<>();

    public int amountOfTime(TreeNode root, int start) {
        
        helper1(root,start); //creating node to root path
        
        int blocker=-1;
        for(int i=0;i<path.size();i++)
        {   
            if(i>0)
            {
                blocker=path.get(i-1).val;
            }

            helper2(path.get(i),blocker,i);
        }

        return max;
    }
      
      public void helper2(TreeNode root,int b,int t)
      {
          if(root==null||root.val==b)return ;

          max=Math.max(max,t);

          helper2(root.left,b,t+1);
          helper2(root.right,b,t+1);
      }
    public boolean helper1(TreeNode root,int s)
    {
        if(root==null)
        return false;
        else if(root.val==s)
        {
            path.add(root);
            return true;
        }
        else if(helper1(root.left,s))
        {
            path.add(root);
            return true;
        }
        else if(helper1(root.right,s))
        {
            path.add(root);
            return true;
        }
        else 
         return false;
        
        

    }
}