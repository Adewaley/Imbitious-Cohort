/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node head) {
        Node cur = head, pre = head;
        while(cur != null) {
            if(cur.child == null) {
                pre = cur;
                cur = cur.next;
            } else {
                Node tmp = cur.next;
                Node child = dfs(cur.child);
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
                child.next = tmp;
                if(tmp != null) tmp.prev = child;
                pre = child;
                cur = tmp;
            }
        }
        return pre;
    }// space: O(n)
    // time: O(n)
}