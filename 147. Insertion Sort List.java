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
            ListNode nextNode = head.next;
            
            ListNode node = dummy;
            
            while (node.next != null) {
                if (node.next.val > head.val) break;
                node = node.next;
            }
            
            head.next = node.next;
            node.next = head;
            
            head = nextNode;
        }
        
        return dummy.next;
    }
}