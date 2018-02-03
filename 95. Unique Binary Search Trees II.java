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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return generateTreesHelper(1, n);
    }
        
    public List<TreeNode> generateTreesHelper (int left, int right)
    {
        List<TreeNode> answer = new ArrayList<TreeNode>();
        
        if(left == right){
            answer.add(new TreeNode(left));
            return answer;
        }
        
        List<TreeNode> leftSub, rightSub;
        for(int i = left; i <= right; i++)
        {
            
            leftSub = generateTreesHelper(left, i - 1);
            rightSub = generateTreesHelper(i + 1, right);
            
            for(TreeNode lnode: leftSub)
            {
                for(TreeNode rnode: rightSub)
                {
                    TreeNode tempNode = new TreeNode(i);
                    tempNode.left = lnode;
                    tempNode.right = rnode;
                    answer.add(tempNode);
                }
            }
                
        }
        
        return answer;
    }
}