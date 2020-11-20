/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);

        while (head != null) {

            ListNode tempP = dummy;

            while (tempP.next != null) {
                if (head.val > tempP.next.val) {
                    tempP = tempP.next;
                } else {
                    break;
                }
            }

            ListNode next = tempP.next;
            ListNode headNext = head.next;

            tempP.next = head;
            head.next = next;

            head = headNext;
        }

        return dummy.next;
    }
}