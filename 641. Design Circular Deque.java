class MyCircularDeque {
    private int size;
    private int startIndex;
    private int[] array;

    public MyCircularDeque(int k) {
        array = new int[k];
    }
    
    public boolean insertFront(int value) {


        if (size == array.length) return false;

        array[(startIndex - 1 + array.length) % array.length] = value;
        size++;
        startIndex = (startIndex - 1 + array.length) % array.length;


        return true;
    }
    
    public boolean insertLast(int value) {
        if (size == array.length) return false;

        array[(startIndex + size) % array.length] = value;
        size++;

        return true;
    }
    
    public boolean deleteFront() {
        if (size == 0) return false;

        startIndex = (startIndex + 1) % array.length;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (size == 0) return false;

        size--;
        return true;
    }
    
    public int getFront() {
        return size == 0 ? -1 : array[startIndex];
    }
    
    public int getRear() {
        return size == 0 ? -1 : array[(startIndex + size - 1) % array.length];

    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */