class FirstUnique {

    private List<Integer> list;
    private Map<Integer, Integer> map;
    private int uniqueIndex = -1;

    public FirstUnique(int[] nums) {
        list = new ArrayList<>();
        map = new HashMap<>();

        for (int num : nums) {
            add(num);
        }
    }
    
    public int showFirstUnique() {
        return uniqueIndex == -1 ? -1 : list.get(uniqueIndex);
    }
    
    public void add(int value) {
        System.out.println("add" + value);

        list.add(value);
        int count = map.getOrDefault(value, 0) + 1;

        map.put(value, count);

        if (uniqueIndex == -1 && count == 1) uniqueIndex = list.size() - 1;

        if (uniqueIndex != -1 && value == list.get(uniqueIndex) && count == 2) {
            while (uniqueIndex < list.size()) {
                if (map.get(list.get(uniqueIndex)) != 1) {
                    uniqueIndex++;
                } else {
                    break;
                }
            }

            if (uniqueIndex == list.size()) { uniqueIndex = -1; }
        }

        System.out.println(uniqueIndex);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */