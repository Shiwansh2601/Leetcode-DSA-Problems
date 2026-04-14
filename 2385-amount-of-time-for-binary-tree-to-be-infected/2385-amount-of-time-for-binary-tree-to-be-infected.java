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

    public int amountOfTime(TreeNode root, int start) {
        if (root.left == null && root.right == null)
            return 0;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        buildmap(root,-1, map);
        int ans=-1;

        Queue<Integer>q=new LinkedList<>();
        Set<Integer>set=new HashSet<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int curr=q.remove();
                set.add(curr);

                for(int j=0;j<map.get(curr).size();j++)
                {
                    int v=map.get(curr).get(j);
                    if(!set.contains(v))
                    {
                        q.add(v);
                    }
                }

            }
            ans++;
        }

      return ans;
    }

    public void buildmap(TreeNode root, int par,Map<Integer, ArrayList<Integer>> map) {

       if(root==null)
       return;

       map.put(root.val,new ArrayList<>());

       if(par!=-1)
       {
          map.get(root.val).add(par);
       }

       if(root.left!=null)
       {
           map.get(root.val).add(root.left.val);
       }

       if(root.right!=null)
       {
           map.get(root.val).add(root.right.val);
       }

       buildmap(root.left,root.val,map);
       buildmap(root.right,root.val,map);
    }
}