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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTreeHelper(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTreeHelper(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return null;

        int maxValue = nums[leftIndex];
        int maxIndex = leftIndex;

        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(maxValue);
        root.left = constructMaximumBinaryTreeHelper(nums, leftIndex, maxIndex - 1);
        root.right = constructMaximumBinaryTreeHelper(nums, maxIndex + 1, rightIndex);

        return root;
    }
}