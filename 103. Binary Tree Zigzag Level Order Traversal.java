/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) return result;
        
        List<TreeNode> list = new ArrayList<>();
        
        list.add(root);
        
        boolean order = true;
        
        while (list.size() > 0) {
            List<Integer> l = new ArrayList<>();
            
            if (order) {
                for (int i = 0; i < list.size(); i++) {
                    l.add(list.get(i).val);
                }
            } else {
                for (int i = list.size() - 1; i >= 0; i--) {
                    l.add(list.get(i).val);
                }
            }
            
            result.add(l);
            
            List<TreeNode> temp = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).left != null) temp.add(list.get(i).left);
                if (list.get(i).right != null) temp.add(list.get(i).right);
            }
            
            list = temp;
            order = !order;
        }
        
        return result;
    }
}