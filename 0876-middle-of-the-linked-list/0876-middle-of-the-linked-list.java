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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        ListNode res = null;
        ListNode fast = head;
        ListNode slow = head;
        if (len % 2 == 0) {
            while (fast != null) {
                fast = fast.next;
                fast = fast.next;
                slow = slow.next;
            }
            res = slow;
        } else {
            while (fast.next != null) {
                fast = fast.next;
                fast = fast.next;
                slow = slow.next;
            }
            res = slow;
        }

        return res;
    }
}