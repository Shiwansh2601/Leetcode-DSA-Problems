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
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null)
        return head;
        ArrayList<Integer>arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }

        Collections.sort(arr);
        ListNode res=new ListNode(arr.get(0));
        ListNode curr=res;
        for(int i=1;i<arr.size();i++)
        {
            ListNode newnode=new ListNode(arr.get(i));
            curr.next=newnode;
            curr=newnode;

        }

        return res;
    }
}