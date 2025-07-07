class Solution {
    public int maxEvents(int[][] events) {
        int maxDay = 0;

        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int answer = 0;

        for (int i = 1, j = 0; i <= maxDay; i++) {
            while (j < events.length && events[j][0] <= i) {
                priorityQueue.offer(events[j][1]);
                j++;
            }

            while (!priorityQueue.isEmpty() && priorityQueue.peek() < i) {
                priorityQueue.poll();
            }

            if (!priorityQueue.isEmpty()) {
                priorityQueue.poll();
                answer++;
            }
        }

        return answer;
    }
}