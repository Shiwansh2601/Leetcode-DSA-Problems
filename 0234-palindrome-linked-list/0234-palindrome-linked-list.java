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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
        return true;
        Stack<Integer>stk=new Stack<>();
        ListNode curr=head;
        while(curr!=null)
        {
            stk.push(curr.val);
            curr=curr.next;
        }
        curr=head;
         while(curr!=null)
        {
            if(stk.pop()!=curr.val)
            return false;
            curr=curr.next;
        }

        return true;
    }
}