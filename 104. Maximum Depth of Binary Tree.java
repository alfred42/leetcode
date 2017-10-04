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
    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root, 0);
    }
    
    public int maxDepthHelper(TreeNode root, int depth) {
        if (root == null) return depth;
        
        return Math.max(maxDepthHelper(root.left, depth + 1), maxDepthHelper(root.right, depth + 1));
    }
}