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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        return head;

        ListNode odd=head;
        ListNode even=head.next;
        ListNode currodd=head;
        ListNode curreven=head.next;

        ListNode curr=head.next.next;
        int indx=3;
        while(curr!=null)
        {
            if(indx%2==0)
            {
                curreven.next=curr;
                curreven=curreven.next;
            }
            else
            {
                currodd.next=curr;
                currodd=currodd.next;
            }
            indx++;
            curr=curr.next;
        }
        curreven.next=null;
        currodd.next=even;

        return odd;

    }
}