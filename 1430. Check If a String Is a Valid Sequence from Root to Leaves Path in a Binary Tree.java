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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isValidSequence(root, arr, 0);
    }

    public boolean isValidSequence(TreeNode root, int[] arr, int index) {
        if (root == null) return index == arr.length;

        if (root.val != arr[index]) return false;

        if (index == arr.length - 1) { return root.left == null && root.right == null; }
        
        else { return isValidSequence(root.left, arr, index + 1) || isValidSequence(root.right, arr, index + 1); }

    }
}