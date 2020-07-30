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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        inorderTraversal(root, result);

        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;

        inorderTraversal(root.left, result);

        result.add(root.val);

        inorderTraversal(root.right, result);
    }
}