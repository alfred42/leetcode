class SnapshotArray {
    private List<int[]>[] changeLog;
    private int snapCount;

    public SnapshotArray(int length) {
        this.snapCount = 0;
        this.changeLog = new List[length];

        for (int i = 0; i < changeLog.length; i++) {
            this.changeLog[i] = new ArrayList<>();
        }
    }
    
    public void set(int index, int val) {
        this.changeLog[index].add(new int[] {this.snapCount, val});
    }
    
    public int snap() {
        return this.snapCount++;
    }
    
    public int get(int index, int snap_id) {
        int x = binarySearch(index, snap_id);
        return x == 0? 0: this.changeLog[index].get(x - 1)[1];
    }

    private int binarySearch(int index, int snapId) {
        int low = 0;
        int high = this.changeLog[index].size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            int[] tuple = this.changeLog[index].get(mid);

            if (tuple[0] > snapId + 1 || (tuple[0] == snapId + 1 && tuple[1] >= 0)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */