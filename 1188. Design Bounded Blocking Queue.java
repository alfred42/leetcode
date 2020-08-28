class BoundedBlockingQueue {
    private Queue<Integer> queue;
    private final int capacity;
    private volatile int size;

    public BoundedBlockingQueue(int capacity) {
        this.queue = new LinkedList<Integer>();
        this.capacity = capacity;
    }
    
    public synchronized void enqueue(int element) throws InterruptedException {
        while (size == capacity) {
            wait();
        }

        queue.offer(element);
        size++;
        notifyAll();
    }
    
    public synchronized int dequeue() throws InterruptedException {
        while (size == 0) {
            wait();
        }

        int value = queue.poll();
        size--;
        notifyAll();

        return value; 
    }
    
    public synchronized int size() {
        return this.size;
    }
}