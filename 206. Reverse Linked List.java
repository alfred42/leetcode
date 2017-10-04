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
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        
        while (current != null) {
            ListNode temp = current;
            current = current.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }
        
        return dummy.next;
    }
}