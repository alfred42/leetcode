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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode p = dummy;

        while (p != null) {
            int i = m;

            while(i > 0 && p != null) {
                p = p.next;
                i--;
            }
        
            ListNode temp = p;
            int j = n;

            while (j > 0 && temp != null) {
                temp = temp.next;
                j--;
            }

            if (p != null) p.next = temp == null? null : temp.next;
        }

        return dummy.next;
        
    }
}