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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convertBSTHelper(root);
        return root;
    }
    
    public void convertBSTHelper(TreeNode root) {
        if (root == null) return;
        convertBSTHelper(root.right);
        root.val += sum;
        sum = root.val;
        convertBSTHelper(root.left);
    }
}