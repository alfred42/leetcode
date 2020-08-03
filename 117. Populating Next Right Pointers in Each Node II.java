/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node dummyLeftNode = new Node(0);
        Node previous = dummyLeftNode;
        Node current = root;

        while (current != null) {
            if (current.left != null) {
                previous.next = current.left;
                previous = previous.next;
            }

            if (current.right != null) {
                previous.next = current.right;
                previous = previous.next;
            }

            current = current.next;

            if (current == null) {
                current = dummyLeftNode.next;
                previous = dummyLeftNode;
                previous.next = null;
            }
        }

        return root;
    }
}