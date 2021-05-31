/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Deque<TreeNode> deque = new LinkedList<TreeNode>();

        deque.offer(root);
        deque.offer(null);

        while (deque.size() != 1) {
            boolean foundx = false;
            boolean foundy = false;

            while (deque.peek() != null) {
                
                TreeNode temp = deque.poll();

                if (temp.left != null && temp.right != null && ((temp.left.val == x && temp.right.val == y) || (temp.left.val == y && temp.right.val == x))) return false;

                if (temp.left != null) {
                    if (temp.left.val == x) foundx = true;
                    else if (temp.left.val == y) foundy = true;

                    deque.offer(temp.left);
                }

                if (temp.right != null) {
                    if (temp.right.val == x) foundx = true;
                    else if (temp.right.val == y) foundy = true;

                    deque.offer(temp.right);
                }

                if (foundx && foundy) return true;
            }

                deque.offer(deque.poll());

        }

        return false;
    }
}