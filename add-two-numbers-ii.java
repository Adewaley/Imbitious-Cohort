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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode prev1 = null; // 
        ListNode prev2 = null; //
        ListNode prev = null;
        ListNode result = new ListNode();
        int carry = 0;
        ListNode current = result;
        
        // Need to reverse the both list in order to handle carries
        while(l1 != null){ // 3-4-2-7       
            ListNode temp = l1.next;
            l1.next = prev1;
            prev1 = l1;
            l1 = temp;         
        }
        while(l2 != null){ // 5-6-4       
            ListNode temp = l2.next;
            l2.next = prev2;
            prev2 = l2;
            l2 = temp;
        }
        l1 = prev1;// new head when reversed
        l2 = prev2;
        
        while(l1 != null || l2 != null || carry > 0){
            int v1;
            int v2;
            if(l1 != null){
                v1 = l1.val;
            }else{ v1 = 0; }
            
            if(l2 != null){
                v2 = l2.val;
            }else{ v2 = 0; }
            
            int added = v1 + v2 + carry;
            carry = added/10;
            added = added%10;
            result.next = new ListNode(added);// building the result
           
            result = result.next;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        //reverse the result
        current = current.next;
        while(current != null){ //        
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;         
        }
       
        return prev;
    }

}