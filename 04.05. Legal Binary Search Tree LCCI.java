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
    Integer current;

    public boolean isValidBST(TreeNode root) {
        return checkBalance(root);
    }

    public boolean checkBalance(TreeNode root) {
        if (root == null) return true;

        if (!checkBalance(root.left)) return false;;

        if (current != null) {
            if (root.val <= current) return false;
        }

        current = root.val;

        if (!checkBalance(root.right)) return false;

        return true;
    }
}