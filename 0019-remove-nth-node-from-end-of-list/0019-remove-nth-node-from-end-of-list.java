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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;

        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        count = count - n;

        if(count==0)
        return head.next;
        curr = head;
        int i = 1;
        while (i <= count) {
            if (i == count) {
                curr.next = curr.next.next;
                return head;
            }

            curr = curr.next;
            i++;
        }
        return head;
    }
}