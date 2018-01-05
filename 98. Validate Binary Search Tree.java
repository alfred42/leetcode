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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        TreeNode currentNode = root;
        long current = Long.MIN_VALUE;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                if (currentNode.val <= current) return false;
                current = currentNode.val;
                currentNode = currentNode.right;
            }
        }
        
        return true;
    }
}