class MyQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack2.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        return stack1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        return stack1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.size() + stack2.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */