/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyA = new ListNode(0);
        ListNode dummyB = new ListNode(0);
        
        ListNode currentA = dummyA;
        ListNode currentB = dummyB;
        
        while (head != null) {
            if (head.val < x) {
                currentA.next = head;
                currentA = currentA.next;
            } else {
                currentB.next = head;
                currentB = currentB.next;
            }
            head = head.next;
        }
        
        currentA.next = dummyB.next;
        currentB.next = null;

        return dummyA.next;
    }
}