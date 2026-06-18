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

    List<Integer>list=new ArrayList<>();
        List<TreeNode>ntrpath= new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        
         helper1(root,target);
         
         int breaker=-1;
         for(int i=0;i<ntrpath.size();i++)
         {
            if(i>0)
            {
                breaker=ntrpath.get(i-1).val;
            }
            helper2(ntrpath.get(i),breaker,k-i);
         }
        
         return list;
    }
     
     public void helper2(TreeNode root,int b,int k)
     {
         if(k<0||root==null||root.val==b) return;

         if(k==0)
         {
            list.add(root.val);
         }

         helper2(root.left,b,k-1);
         helper2(root.right,b,k-1);



     }
    
    public boolean helper1(TreeNode root,TreeNode x)
    {
         if(root==null)return false;
         else if(root==x)
         {
            ntrpath.add(root);
            return true;
         }
         else if(helper1(root.left,x))
         {
            ntrpath.add(root);
            return true;
         }
         else if(helper1(root.right,x))
         {
            ntrpath.add(root);
            return true;
         }
         else 
         return false;

    }
}