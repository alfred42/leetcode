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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        while (head != null) {
            if (head.next != null) {
                if (head.next.next == null || (head.next.next != null && head.next.next.val != head.next.val)) {
                    head = head.next;
                } else {
                    ListNode temp = head.next.next;
                    while (temp != null && temp.val == head.next.val) temp = temp.next;
                    head.next = temp;
                }
            } else {
                head = head.next;
            }
        }
        
        return dummy.next;
    }
}