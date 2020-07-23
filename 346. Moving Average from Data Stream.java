class MovingAverage {
    Deque<Integer> deque;
    int size;
    double sum = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.deque = new ArrayDeque();
        this.size = size;
    }
    
    public double next(int val) {
        if (deque.size() == size) {
            sum -= deque.removeFirst();
        }

        deque.addLast(val);
        sum += val;

        return sum / deque.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */