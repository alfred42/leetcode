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
    private int longestPath = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);

        return longestPath;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = 0, right = 0;
        int left1 = dfs(root.left);
        int right1 = dfs(root.right);

        if (root.left != null && root.left.val == root.val) left = left1 + 1;
        if (root.right != null && root.right.val == root.val) right = right1 + 1;

        longestPath = Math.max(left + right, longestPath);

        return Math.max(left, right);
    }
}