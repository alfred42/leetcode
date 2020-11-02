class BoundedBlockingQueue {
    private Queue<Integer> queue;
    private final int capacity;

    private ReentrantLock lock = new ReentrantLock();
    private Condition fullCondition = lock.newCondition();
    private Condition emptyCondition = lock.newCondition();

    public BoundedBlockingQueue(int capacity) {
        this.queue = new LinkedList<Integer>();
        this.capacity = capacity;
    }
    
    public void enqueue(int element) throws InterruptedException {
        lock.lock();

        try {
            while (queue.size() == capacity) {
                fullCondition.await();
            }

            queue.offer(element);
            emptyCondition.signal();
        } finally {
            lock.unlock();
        }
    }
    
    public int dequeue() throws InterruptedException {
        lock.lock();

        try {
            while (queue.size() == 0) {
                emptyCondition.await();
            }

            int value = queue.poll();
            fullCondition.signal();

            return value;
        } finally {
            lock.unlock();
        }
    }
    
    public synchronized int size() {
        lock.lock();

        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }
}