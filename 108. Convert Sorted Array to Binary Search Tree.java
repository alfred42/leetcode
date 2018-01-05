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
        if(nums.length == 0) return null;
        
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }
    
    public TreeNode sortedArrayToBSTHelper(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return null;
        
        int mid = leftIndex + (rightIndex - leftIndex) / 2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = sortedArrayToBSTHelper(nums, leftIndex, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, rightIndex);
        
        return node;
    }
}