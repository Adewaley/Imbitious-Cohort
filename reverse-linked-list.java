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
    public ListNode reverseList(ListNode head) {
        //Node prev = head;
        ListNode curr = head; // 2
        ListNode prev = null; // 1
        
        while (curr!= null){ // while 1 not null
            ListNode temp = curr.next; // temp = 1
            curr.next  = prev; // 2.next = 1
            prev = curr;
            curr = temp;  // curr = 3
            
        }
        head  = prev;
        return head;
    }
}