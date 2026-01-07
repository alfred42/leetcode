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
    long mod = 1000000007;
    long totalSum = 0;
    long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        totalSum = calculateTotalSum(root);

        calculateSubtreeSum(root);

        return (int) (maxProduct % mod);
    }

    private int calculateTotalSum(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.val + calculateTotalSum(root.left) + calculateTotalSum(root.right);
        }
    }

    private int calculateSubtreeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = calculateSubtreeSum(root.left);
        int rightSum = calculateSubtreeSum(root.right);

        int subtreeSum = leftSum + rightSum + root.val;

        long product = subtreeSum * (totalSum - subtreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subtreeSum;
    }
}