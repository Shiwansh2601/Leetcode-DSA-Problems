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
 class Pair1{
    TreeNode par;
    int lvl;

    Pair1(TreeNode p,int l)
    {
        par=p;
        lvl=l;
    }
 }

 class Pair2{
    TreeNode node;
    TreeNode par;

    Pair2(TreeNode n,TreeNode p)
    {
        node=n;
        par=p;

    }
 }
class Solution {
    
    HashMap<Integer,Pair1>map=new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {

       Queue<Pair2>q=new LinkedList<>();
       q.offer(new Pair2(root,null));


       int level=0;
       
       while(!q.isEmpty())
       {
           int size=q.size();

           for(int i=0;i<size;i++)
           {
              Pair2 curr=q.poll();
              TreeNode n=curr.node;
              TreeNode p=curr.par;

              map.put(n.val,new Pair1(p,level));

              if(n.left!=null)
              {
                q.offer(new Pair2(n.left,n));
              }

              if(n.right!=null)
              {
                q.offer(new Pair2(n.right,n));
              }
           }

           level++;
       }
       

       if((map.get(x).par!=map.get(y).par) && (map.get(x).lvl==map.get(y).lvl))
       return true;
       else
       return false;
       
    }

   
}