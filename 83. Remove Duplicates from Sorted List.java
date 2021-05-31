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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        while (head != null) {
            int prev = head.val;

            ListNode temp = head.next;
            while (temp != null) {
                if (temp.val == prev) {
                    temp = temp.next;
                } else {
                    break;
                }
            }

            head.next = temp;

            head = head.next;
        }

        return dummy.next;
    }
}