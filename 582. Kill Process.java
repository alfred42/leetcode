class Solution {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < ppid.size(); i++) {
            List<Integer> childrenList = map.getOrDefault(ppid.get(i), new ArrayList<>());
            childrenList.add(pid.get(i));
            map.put(ppid.get(i), childrenList);
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        queue.offer(kill);

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            list.add(temp);

            if (map.containsKey(temp)) {
                for (Integer i : map.get(temp)) {
                    queue.offer(i);
                }
            }
        }

        return list;
    }
}