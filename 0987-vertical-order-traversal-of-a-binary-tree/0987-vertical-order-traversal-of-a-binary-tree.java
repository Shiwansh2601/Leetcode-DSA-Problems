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

    static int min=0;
    static int max=0;
    
    class Pair
    {
        TreeNode node;
        int x;
        int lvl;
        
        Pair(TreeNode n,int d,int l)
        {
            node=n;
            x=d;
            lvl=l;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        min=0;
        max=0;
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        List<List<Integer>>ans=new ArrayList<>();
        
        solve(root,map);
        
        for(int i=min;i<=max;i++)
        {
            ans.add(map.get(i));
        }
        
        return ans;
    }

    
    public void solve(TreeNode root,HashMap<Integer,ArrayList<Integer>>map)
    {
      PriorityQueue<Pair>q=new PriorityQueue<>((a,b)->{
          if(a.lvl!=b.lvl)
          return a.lvl-b.lvl;
          
          return a.node.val-b.node.val;

      });
      q.add(new Pair(root,0,0));
      
      
      while(!q.isEmpty())
      {
          Pair curr=q.poll();
          
          TreeNode temp=curr.node;
          int x=curr.x;
          int l=curr.lvl;
          int d=temp.val;
          
          
          min=Math.min(min,x);
          max=Math.max(max,x);
          
          if(map.containsKey(x))
          {
              map.get(x).add(d);
          }
          else
          {
              map.put(x,new ArrayList<>());
              map.get(x).add(d);
              
          }
          
          
          if(temp.left!=null)
          q.add(new Pair(temp.left,x-1,l+1));
           
           
          if(temp.right!=null)
          q.add(new Pair(temp.right,x+1,l+1));
          
      }
      
      
        
    }
}