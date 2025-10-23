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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int sum=l1.val+l2.val+carry;
        ListNode head=new ListNode(sum%10);
        ListNode curr=head;
        carry=sum/10;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null)
        {
            sum=l1.val+l2.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=newnode;
            l1=l1.next;
            l2=l2.next;
        }

         while(l1!=null)
        {
            sum=l1.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=newnode;
            l1=l1.next;
        }
         while(l2!=null)
        {
            sum=l2.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=newnode;
            l2=l2.next;
        }
       
       if(carry>0)
       {
            ListNode newnode=new ListNode(carry);
            curr.next=newnode;
            curr=newnode;
       }

       
        return head;
    }
}