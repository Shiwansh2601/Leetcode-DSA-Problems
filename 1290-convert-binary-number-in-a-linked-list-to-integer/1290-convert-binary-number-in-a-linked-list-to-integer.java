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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        int mul=1;
        int sum=0;
        int s=list.size();
        for(int i=s-1;i>=0;i--)
        {

            sum=sum+(list.get(i)*mul);
            mul=mul*2;
        }
         return sum;
    }
}