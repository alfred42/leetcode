class MyCircularDeque {
    private class Node {
        public Node previous;
        public Node next;
        public int value;

        public Node(int n) {
            this.value = n;
        }
    }

    Node head;
    Node rear;
    int size;
    int maxSize;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        size = 0;
        maxSize = k;
        head = null;
        rear = null;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size == maxSize) return false;

        Node newNode = new Node(value);

        if (size == 0) {
            head = newNode;
            rear = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size == maxSize) return false;
        
        Node newNode = new Node(value);

        if (size == 0) {
            head = newNode;
            rear = newNode;
        } else {
            newNode.previous = rear;
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) return false;

        if (size == 1) {
            head = null;
            rear = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) return false;

        if (size == 1) {
            head = null;
            rear = null;
        } else {
            rear = rear.previous;
            rear.next = null;
        }

        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        return size == 0 ? -1 : head.value;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        return size == 0 ? -1 : rear.value;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == maxSize;
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