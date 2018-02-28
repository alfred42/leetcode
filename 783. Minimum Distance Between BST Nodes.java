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
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        minDiffInBSTHelper(root);
        return minDiff == Integer.MAX_VALUE? 0: minDiff;
    }
    
    public void minDiffInBSTHelper(TreeNode root) {
        if (root == null) return;
        
        minDiffInBSTHelper(root.left);
        if (prev != null) minDiff = Math.min(minDiff, Math.abs(root.val - prev));
        prev = root.val;
        minDiffInBSTHelper(root.right);
    }
}