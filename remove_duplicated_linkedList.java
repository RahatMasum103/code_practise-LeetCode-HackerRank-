Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3

/**********************************/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode curr = head;
        
        if(head == null) return head;
        
        while(curr.next!=null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return head;        
        
        /* 
        // Debug Block
        String nodePrint =" ";
        while(curr !=null)
        {
            nodePrint += curr.val;
            curr = curr.next;
        }
        System.out.println("debug.. "+ nodePrint);
        */

    }
}
