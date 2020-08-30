class SnapshotArray {
    private class Entry {
        public int snapId;
        public int val;

        public Entry(int snapId, int val) {
            this.snapId = snapId;
            this.val = val;
        }
    }

    private List<List<Entry>> recordList;
    private int currentSnapId;

    public SnapshotArray(int length) {
        recordList = new ArrayList<List<Entry>>();

        for (int i = 0; i < length; i++) {
            recordList.add(new ArrayList<>());
        }

        this.currentSnapId = 0;
    }
    
    public void set(int index, int val) {
        recordList.get(index).add(new Entry(currentSnapId, val));
    }
    
    public int snap() {
        return currentSnapId++;
    }
    
    public int get(int index, int snap_id) {
        int value = 0;

        for (Entry entry : recordList.get(index)) {
            if (entry.snapId <= snap_id) {
                value = entry.val;
            } else {
                break;
            }
        }

        return value;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */