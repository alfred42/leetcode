/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                ListNode temp = head.next;
                while (temp != null && temp.val == head.val) {
                    temp = temp.next;
                }
                
                head.next = temp;
            } 
            
            head = head.next;
        }
        
        return dummy.next;
    }
}