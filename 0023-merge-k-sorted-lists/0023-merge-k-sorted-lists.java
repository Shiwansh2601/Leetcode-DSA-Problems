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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode curr=lists[i];
            while(curr!=null)
            {
                minHeap.add(curr.val);
                curr=curr.next;
            }
        }

        ListNode res=new ListNode(-1);
        ListNode curr=res;

        while(!minHeap.isEmpty())
        {
            ListNode newnode=new ListNode(minHeap.poll());
            curr.next=newnode;
            curr=curr.next;
        }
      
      return res.next;

    }
}