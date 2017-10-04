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
        if (headA == null || headB == null) {
            return null;
        }
        
        int lengthA = 1;
        int lengthB = 1;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while (tempA.next != null) {
            tempA = tempA.next;
            lengthA++;
        }
        
        while (tempB.next != null) {
            tempB = tempB.next;
            lengthB++;
        }
        
        if (tempA != tempB) {
            return null;
        }
        
        ListNode fast;
        ListNode slow;
        
        int diff = Math.abs(lengthA - lengthB);
        
        if (lengthA > lengthB) {
            fast = headA;
            slow = headB;
        } else {
            fast = headB;
            slow = headA;
        }
        
        while (diff > 0) {
            fast = fast.next;
            diff--;
        }
        
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return fast;
    }
}