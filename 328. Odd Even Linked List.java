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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);

        ListNode pOdd = oddDummy;
        ListNode pEven = evenDummy;

        while (head != null) {
            pOdd.next = head;
            pOdd = pOdd.next;

            head = head.next;

            if (head != null) {
                pEven.next = head;
                pEven = pEven.next;

                head = head.next;
            }
        }

        pOdd.next = evenDummy.next;
        pEven.next = null;

        return oddDummy.next;
    }
}