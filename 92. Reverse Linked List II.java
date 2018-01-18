/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        dummy.next = head;
        
        int count = n - m + 1;
        
        while (m - 1 > 0) {
            current = current.next;
            m--;
        }
        Stack<ListNode> stack = new Stack<>();
        
        ListNode next = current.next;
        
        while (count > 0) {
            stack.push(next);
            next = next.next;
            count--;
        }
        
        while (stack.size() != 0) {
            ListNode temp = stack.pop();
            current.next = temp;
            current = current.next;
        }
        
        current.next = next;
        
        return dummy.next;
        
    }
}