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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        if (root == null) return result;
        
        if (root != null && root.left == null && root.right == null) result.add(String.valueOf(root.val));
        if (root.left != null) binaryTreePathsHelper(String.valueOf(root.val), root.left, result);
        if (root.right != null) binaryTreePathsHelper(String.valueOf(root.val), root.right, result);        
        return result;
    }
    
    public void binaryTreePathsHelper(String prefix, TreeNode node, List<String> result) {
        if (node != null && node.left == null && node.right == null) result.add(prefix + "->" + String.valueOf(node.val));
        else {
            if (node.left != null) binaryTreePathsHelper(prefix + "->" + String.valueOf(node.val), node.left, result);
            if (node.right != null) binaryTreePathsHelper(prefix + "->" + String.valueOf(node.val), node.right, result);
        }
        
    }
}