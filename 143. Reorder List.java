/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (slow == null) return;
                
        ListNode secondDummy = new ListNode(0);
        
        ListNode previous = null;
        ListNode current = slow.next;
        
        slow.next = null;
        
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        current = dummy.next;
        
        ListNode temp = dummy;

        while (current != null) {
            if (current != null) {
                temp.next = current;
                current = current.next;
                temp = temp.next;
            }
            
            if (previous != null) {
                temp.next = previous;
                previous = previous.next;
                temp = temp.next;
            }
        }

        return;
    }
}