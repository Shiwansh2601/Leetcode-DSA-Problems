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

   
     public ListNode reverseList(ListNode head,int len) {

        ListNode pre=null;
        ListNode curr=head;
        ListNode Next=null;

        while(len>0)
        {   
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
            len--;
        }
        
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null || head.next==null || l==r)
        return head;

        ListNode dummy = new ListNode(-1);
         dummy.next = head;

        ListNode leftbefore=dummy;
        ListNode rightafter=null;
         ListNode left =head;
         ListNode right=null;
          ListNode curr=head;
         int i=1;
        while(curr!=null)
        {
            if(i==l-1)
             {
                 leftbefore=curr;
                 left=curr.next;
             }
             else if(i==r)
            {
                 right=curr;
                 rightafter=curr.next;
            }


            i++;
            curr=curr.next; 
        }

        leftbefore.next=reverseList(left,r-l+1);
        
       left.next = rightafter;

        return dummy.next;


       

    }
}