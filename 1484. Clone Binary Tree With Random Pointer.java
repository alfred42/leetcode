/**
 * Definition for a binary tree node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node random;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right, Node random) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *         this.random = random;
 *     }
 * }
 */
class Solution {
    Map<Node, NodeCopy> nodeMap = new HashMap<>();

    public NodeCopy copyRandomBinaryTree(Node root) {
        if (root == null) return null;
        if (nodeMap.containsKey(root)) return nodeMap.get(root);
        
        NodeCopy clonedNode = new NodeCopy(root.val);
        nodeMap.put(root, clonedNode);

        clonedNode.left = copyRandomBinaryTree(root.left);
        clonedNode.right = copyRandomBinaryTree(root.right);
        clonedNode.random = copyRandomBinaryTree(root.random);

        return clonedNode;
    }
}