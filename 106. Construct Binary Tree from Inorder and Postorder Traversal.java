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
    private int[] inorder;
    private int[] postorder;
    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.indexMap = new HashMap<>();
        this.inorder = inorder;
        this.postorder = postorder;

        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTreeHelper(0, inorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int postorderLeft, int postorderRight, int inorderLeft, int inorderRight) {
        if (postorderLeft > postorderRight) return null;

        int inorderRoot = indexMap.get(postorder[postorderRight]);
        int leftTreeNodeCount = inorderRoot - inorderLeft;

        TreeNode node = new TreeNode(inorder[inorderRoot]);
        node.left = buildTreeHelper(postorderLeft, postorderLeft + leftTreeNodeCount - 1, inorderLeft, inorderRoot - 1);
        node.right = buildTreeHelper(postorderLeft + leftTreeNodeCount, postorderRight - 1, inorderRoot + 1, inorderRight);

        return node;
    }
}