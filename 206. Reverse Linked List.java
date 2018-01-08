/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListHelper(head, null);
    }
    
    public ListNode reverseListHelper(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        
        ListNode next = head.next;
        head.next = newHead;
        return reverseListHelper(next, head);
    }
}