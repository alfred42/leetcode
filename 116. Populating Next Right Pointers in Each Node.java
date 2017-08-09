/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        List<TreeLinkNode> list = new ArrayList<>();
        
        if (root != null) list.add(root);
        
        while (list.size() != 0) {
            List<TreeLinkNode> temp = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    list.get(i).next = null;
                } else {
                    list.get(i).next = list.get(i + 1);
                }
                
                if (list.get(i).left != null) temp.add(list.get(i).left);
                if (list.get(i).right != null) temp.add(list.get(i).right);
            }
            
            list = temp;
        }
    }
}