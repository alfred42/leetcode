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
    public int maxDepth(TreeNode root) {
        return calMaxDepth(root);
    }

    public int calMaxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(calMaxDepth(root.left), calMaxDepth(root.right)) + 1;
    }
