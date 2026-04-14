/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        buildmap(root,-1, map);
        Set<Integer>set=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(target.val);

        while(k>0  && !q.isEmpty())
        {
            
            
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                int curr=q.poll();
                set.add(curr);

                for(int nei:map.get(curr))
                {
                    if(!set.contains(nei))
                    {
                        q.add(nei);
                    }
                }
            }
            k--;
         }

         while(!q.isEmpty())
         {
            ans.add(q.poll());
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