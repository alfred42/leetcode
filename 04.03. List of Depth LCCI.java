/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return new ListNode[0];

        List<ListNode> ans = new ArrayList<ListNode>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(tree);

        while (!queue.isEmpty()) {
            int size = queue.size();

            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (size > 0) {
                TreeNode currentNode = queue.poll();
                
                ListNode tempNode = new ListNode(currentNode.val);

                current.next = tempNode;
                current = current.next;

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);

                size--;
            }

            ans.add(dummy.next);
        }

        return ans.toArray(new ListNode[ans.size()]);
    }
}