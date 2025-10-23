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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode curr=head.next;
        int sum=0;

        while(curr!=null)
        {   
            sum=sum+curr.val;
            if(curr.val==0)
            {
                ListNode newnode=new ListNode(sum);
                temp.next=newnode;
                temp=newnode;
                sum=0;
            }
            curr=curr.next;
        }

        return head.next;
    }
}