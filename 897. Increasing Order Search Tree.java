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
    TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;

        TreeNode dummy = new TreeNode(0);

        current = dummy;
        inorder(root);

        return dummy.right;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        root.left = null;
        current.right = root;
        current = current.right;
        
        inorder(root.right);
    }
}