/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        serializeHelper(root, sb);

        return sb.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        } else {
            sb.append(root.val + ",");

            serializeHelper(root.left, sb);
            serializeHelper(root.right, sb);
        }

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        List<String> nodeList = new LinkedList<>(Arrays.asList(nodes));
        
        return deserializeHelper(nodeList);
    }

    public TreeNode deserializeHelper(List<String> nodes) {
        if (nodes.get(0).equals("#")) {
            nodes.remove(0);
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.valueOf(nodes.get(0)));

            nodes.remove(0);

            node.left = deserializeHelper(nodes);
            node.right = deserializeHelper(nodes);

            return node;
        }

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));