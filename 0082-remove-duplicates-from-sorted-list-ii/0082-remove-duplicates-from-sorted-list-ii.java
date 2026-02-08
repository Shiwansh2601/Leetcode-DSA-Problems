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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = head;
        ListNode fast = head.next;
        ListNode prev = dummy;

        while (fast != null) {
            
            boolean isdublicate=false;
                while (fast != null && slow.val == fast.val) {
                    fast = fast.next;
                    isdublicate=true;
                }

                if(isdublicate)
                {
                    prev.next=fast;
                }
                else
                {
                    prev=prev.next;
                }

                slow=fast;
                 if (fast != null)
                fast = fast.next;

        }

        return dummy.next;
    }
}