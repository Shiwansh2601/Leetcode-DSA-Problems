/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return null;

        if(k==0||head.next==null)
        return head;

        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }

       k%=len;
        
    
        int i=1;
         while(i<=k)
         {
             curr=head;
            while(curr.next.next!=null)
            {
             curr=curr.next;
            }

         ListNode prelast=curr;

            ListNode last=prelast.next;
            prelast.next=null;
            last.next=head;
            head=last;
            i++;
         }

         return head;
    }
}