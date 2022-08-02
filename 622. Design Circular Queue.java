class MyCircularQueue {
    private int[] values;
    private int startIndex;
    private int size;

    public MyCircularQueue(int k) {
        values = new int[k];
        size = 0;
        startIndex = 0;
    }
    
    public boolean enQueue(int value) {
        if (size == values.length) return false;

        values[(startIndex + size) % values.length] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (size == 0) return false;

        startIndex = (startIndex + 1) % values.length;

        size--;
        return true;
    }
    
    public int Front() {
        if (size == 0) return -1;
        return values[startIndex];
    }
    
    public int Rear() {
        if (size == 0) return -1;
        return values[(startIndex + size - 1) % values.length];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == values.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */