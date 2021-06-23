/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode dummyA = new ListNode();
        dummyA.next = headA;

        ListNode dummyB = new ListNode();
        dummyB.next = headB;

        while (headA.next != null && headB.next != null) {
            headA = headA.next;
            headB = headB.next;
        }

        int diff = 0;

        while (headA.next != null || headB.next != null) {
            if (headA.next != null) {
                headA = headA.next;
                diff++;
            }
            if (headB.next != null) {
                headB = headB.next;
                diff--;
            }
        }

        if (headA != headB) return null;

        headA = dummyA.next;
        headB = dummyB.next;

        while (diff != 0) {
            if (diff > 0) {
                headA = headA.next;
                diff--;
            } else {
                headB = headB.next;
                diff++;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}