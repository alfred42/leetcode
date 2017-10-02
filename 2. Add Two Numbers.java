/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int i1 = (l1 == null)? 0: l1.val;
            int i2 = (l2 == null)? 0: l2.val;
            
            int temp = i1 + i2 + carry;
            
            if (temp >= 10) {
                temp -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            
            current.next = new ListNode(temp);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry == 1) {
            current.next = new ListNode(1);
        }
        
        return dummy.next;
    }
}