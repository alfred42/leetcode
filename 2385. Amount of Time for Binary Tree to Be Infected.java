/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> dfsMap = new HashMap<>();
        dfs(dfsMap, root);

        Set<Integer> visited = new HashSet<>();

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {start, 0});

        visited.add(start);

        int time = 0;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            time = current[1];

            for (int connectVal : dfsMap.get(current[0])) {
                if (!visited.contains(connectVal)) {
                    visited.add(connectVal);
                    queue.offer(new int[] {connectVal, time + 1});
                }
            }
        }
 
        return time;
    }

    public void dfs(Map<Integer, List<Integer>> map, TreeNode root) {
        if (root != null) {
            map.putIfAbsent(root.val, new ArrayList<Integer>());

            if (root.left != null) {
                map.get(root.val).add(root.left.val);
                map.putIfAbsent(root.left.val, new ArrayList<Integer>());
                map.get(root.left.val).add(root.val);
                dfs(map, root.left);
            }

            if (root.right != null) {
                map.get(root.val).add(root.right.val);
                map.putIfAbsent(root.right.val, new ArrayList<Integer>());
                map.get(root.right.val).add(root.val);
                dfs(map, root.right);
            }
        }
    }
}