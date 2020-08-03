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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return null;

        int mid = leftIndex + (rightIndex - leftIndex) / 2;

        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = sortedArrayToBST(nums, leftIndex, mid - 1);
        newNode.right = sortedArrayToBST(nums, mid + 1, rightIndex);

        return newNode;
    }
}