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
    List<Integer> list = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {
        getLonelyNodes(list, root);
        
        return list;
    }

    public void getLonelyNodes(List<Integer> list, TreeNode root) {
        if (root == null) return;
        if (root.left != null && root.right == null) {
            list.add(root.left.val);
        }

        if (root.right != null && root.left == null) {
            list.add(root.right.val);
        }

        getLonelyNodes(root.left);
        getLonelyNodes(root.right);
    }
}