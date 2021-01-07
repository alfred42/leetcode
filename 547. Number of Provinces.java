class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        for (int i = 0; i < visited; i++) {
            if (!visited[i]) {
                Deque<Integer> deque = new LinkedList<>();

                deque.offer(i);

                while (!deque.isEmpty()) {
                    int current = deque.poll();

                    if (!visited[current]) {
                        for (int j = 0; j < isConnected[current].length; j++) {
                            if (isConnected[current][j] == 1 && !visited[j]) {
                                deque.offer(j);
                            }
                        }

                        visited[current] = true;
                    }
                }

                count++;
            }
        }
        
        return false;
    }
}