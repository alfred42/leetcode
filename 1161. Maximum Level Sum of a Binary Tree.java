class Solution {
    public int maxLevelSum(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();

        int maxSum = Integer.MIN_VALUE;
        int minLevel = Integer.MAX_VALUE;

        int currentLevel = 1;

        nodeList.add(root);

        while (nodeList.size() != 0) {
            List<TreeNode> nextLevelNodeList = new ArrayList<>();

            int sum = 0;

            for (TreeNode node : nodeList) {
                sum += node.val;

                if (node.left != null) nextLevelNodeList.add(node.left);
                if (node.right != null) nextLevelNodeList.add(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                minLevel = currentLevel;
            }

            nodeList = nextLevelNodeList;
            currentLevel++;
        }
        
        return minLevel;
    }
}