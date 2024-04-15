class MyHashMap {
    private int[] array;

    public MyHashMap() {
        this.array = new int[1000001];

        for (int i = 0; i < array.length; i++) {
            this.array[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        if (key < 0 || key > 1000001) return;

        this.array[key] = value;
    }
    
    public int get(int key) {
        if (key < 0 || key > 1000001) return -1;
        return this.array[key];
    }
    
    public void remove(int key) {
        if (key < 0 || key > 1000001) return;

        this.array[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */