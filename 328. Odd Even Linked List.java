/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode nextDummy = new ListNode(0);
        
        ListNode current = head;
        
        ListNode head1 = dummy;
        ListNode head2 = nextDummy;
        
        while (current != null) {
            head1.next = current;
            head1 = head1.next;
            current = current.next;
            
            if (current != null) {
                head2.next = current;
                head2 = head2.next;
                current = current.next;
            }
        }
        
        head1.next = nextDummy.next;
        head2.next = null;
        
        return dummy.next;
    }
}