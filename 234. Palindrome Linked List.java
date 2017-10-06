/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        Stack<ListNode> stack = new Stack<>();
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow);
        }
        
        if (fast.next == null) {
            slow = slow.next;
        } else {
            slow = slow.next.next;
        }
        
        while (!stack.empty()) {
            ListNode temp = stack.pop();
            
            if (temp.val != slow.val) {
                return false;
            }
            
            slow = slow.next;
        }
        
        return true;
    }
}