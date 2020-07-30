class MyCircularQueue {
    int[] array;
    int head;
    int rear;
    int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.array = new int[k];
        head = 0;
        rear = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (size == array.length) return false;

        array[rear % array.length] = value;
        rear++;
        rear %= array.length;

        size++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (size == 0) return false;

        int temp = array[head % array.length];
        head++;
        head %= array.length;
        size--;

        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return size == 0 ? -1 : array[head];

    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return size == 0 ? -1 : rear == 0 ? array[array.length - 1] : array[rear - 1];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == array.length;
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