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
    public static int currentMin;
    public static int rootValue;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        currentMin = -1;
        rootValue = root.val;

        dfs(root);

        return currentMin;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;

        if (currentMin != -1 && root.val >= currentMin) return;

        if (root.val > rootValue) {
            currentMin = root.val;
        }

        dfs(root.left);
        dfs(root.right);

        return;
    }
}