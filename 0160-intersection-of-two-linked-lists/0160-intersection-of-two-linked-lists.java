/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode curr1= headA;
        while(curr1!=null)
        {
            len1++;
            curr1=curr1.next;
        }
       
        ListNode curr2= headB;
        while(curr2!=null)
        {
            len2++;
            curr2=curr2.next;
        }
        int diff=Math.abs(len1-len2);
        int i=0;
         curr1=headA;
         curr2=headB;
        if(len1>len2)
        {
           
            while(i!=diff)
            {
               curr1=curr1.next;
               i++;
            }
        }
        else
        {
            
            while(i!=diff)
            {
               curr2=curr2.next;
               i++;
            }
        }

        while(curr1!=curr2)
        {
            curr1=curr1.next;
            curr2=curr2.next;
        }

        return curr1;
    }
}