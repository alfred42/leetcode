/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        
        return sortedListToBSTHelper(head, null);
    }
    
    public TreeNode sortedListToBSTHelper(ListNode start, ListNode end) {
        ListNode fast = start;
        ListNode slow = start;
        
        if (start == end) return null;
        
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode temp = new TreeNode(slow.val);
        temp.left = sortedListToBSTHelper(start, slow);
        temp.right = sortedListToBSTHelper(slow.next, end);
        return temp;
    }
}
