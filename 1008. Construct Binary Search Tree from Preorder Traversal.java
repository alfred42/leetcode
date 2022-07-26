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
    public TreeNode bstFromPreorder(int[] preorder) {
        return doBstFromPreOrder(preorder, 0, preorder.length - 1);
    }

    public TreeNode doBstFromPreOrder(int[] preorder, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return null;
        else if (leftIndex == rightIndex) return new TreeNode(preorder[leftIndex]);

        TreeNode node = new TreeNode(preorder[leftIndex]);

        int leftEndIndex = searchRightRootStartIndex(preorder, leftIndex, rightIndex, preorder[leftIndex]);

        node.left = doBstFromPreOrder(preorder, leftIndex + 1, leftEndIndex);
        node.right = doBstFromPreOrder(preorder, leftEndIndex + 1, rightIndex);

        return node;
    }

    public int searchRightRootStartIndex(int[] preorder, int left, int right, int value) {

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (preorder[mid] > value) {
            right = mid - 1;
            } else {
                left = mid;
            }
        }

        return left;    
    }
}