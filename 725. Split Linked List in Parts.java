/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode head = root;
        int count = 0;
        ListNode[] result = new ListNode[k];
        
        while (head != null) {
            head = head.next;
            count++;
        }
        
        head = root;
        
        int per_count = count / k;
        
        
        if (per_count == 0) {
            for (int i = 0; i < k; i++) {
                if (head != null) {
                    result[i] = head;
                    ListNode temp = head.next;
                    head.next = null;
                    head = temp;
                } else {
                    result[i] = null;
                }
            }
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println(count + " " + per_count);
                if (count <= 0) result[i] = null;
                
                int tempCount = per_count;
                if ((k - i) * per_count != count) {
                    tempCount++;
                }
                
                count -= tempCount;
                
                ListNode dummy = new ListNode(0);
                ListNode current = dummy;
                   
                for (int j = 0; j < tempCount; j++) {
                    current.next = head;
                    head = head.next;
                    current = current.next;
                }
                
                current.next = null;
                
                result[i] = dummy.next;
            }
        }
        
        return result;
    }
}