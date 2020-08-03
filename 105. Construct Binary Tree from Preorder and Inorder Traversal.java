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
    private int[] preorder;
    private int[] inorder;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTreeHelper(0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) return null;

        int inorderRootIndex = inorderIndexMap.get(preorder[preorderLeft]);
        int leftTreeNodeCount = inorderRootIndex - inorderLeft;

        TreeNode node = new TreeNode(inorder[inorderRootIndex]);

        node.left = buildTreeHelper(preorderLeft + 1, preorderLeft + leftTreeNodeCount, inorderLeft, inorderRootIndex - 1);
        node.right = buildTreeHelper(preorderLeft + 1 + leftTreeNodeCount, preorderRight, inorderRootIndex + 1, inorderRight);
        return node;
    }
}