/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = dummy;
        int count = 0;
        
        while (current.next != null) {
            current = current.next;
            count++;
        }
        
        if (k % count == 0) return dummy.next;
        
        k = count - k % count;
        current.next = dummy.next;
        
        while (k > 0) {
            dummy = dummy.next;
            k--;
        }
        
        head = dummy.next;
        dummy.next = null;
        
        return head;
    }
}