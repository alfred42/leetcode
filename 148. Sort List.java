/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
    
        prev.next = null;
    
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);
        
        return merge(list1, list2);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            } else if (list2 == null) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            } else {
                if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                    current = current.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                    current = current.next;
                }
            }
        }
        
        return dummy.next;
    }
}