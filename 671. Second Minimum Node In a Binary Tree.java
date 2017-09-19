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
    
    int answer = Integer.MAX_VALUE;
    int min1 = Integer.MAX_VALUE;
    
    public void dfs(TreeNode root) {
        if (root != null) {
            if (root.val > min1 && root.val < answer) {
                answer = root.val;
            } else if (root.val == min1) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        
        dfs(root);
        
        return answer == Integer.MAX_VALUE? -1: answer;
    }
}