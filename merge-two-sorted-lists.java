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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         // 2pointer technique
        
        // heads of the two lists 
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode headRef = list1;
        ListNode headRef2 = list2;
        
        ListNode output = new ListNode(-1);
        
        ListNode prev = output;
        if(l1 == null) return l2;     
        if(l2 == null) return l1;
    
        while(l1 != null && l2 != null){ // O(n) --> n is the amount of nodes in list1
            if(l1.val <= l2.val){
                ListNode temp1 = l1.next;
                //l1.next = l2; // 1->1
                prev.next = l1;
                l1 = temp1; // 2
                
            }else if(l1.val > l2.val){
                ListNode temp2 = l2.next;
                //l2.next = l1; // 1->2
                prev.next = l2;
                l2 = temp2;
            } 
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return output.next;
        
        // time is O(n)
        // space is O(1)
    }
}