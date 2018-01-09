class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if (q1.isEmpty()) q2.offer(x);
        else q1.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (q1.isEmpty()) {
            while (q2.size() != 1) {
                q1.offer(q2.poll());
            }
            
            return q2.poll();
        } else {
            while (q1.size() != 1) {
                q2.offer(q1.poll());
            }
            
            return q1.poll();
        }
    }
    
    /** Get the top element. */
    public int top() {
        if (q1.isEmpty()) {
            while (q2.size() != 1) {
                q1.offer(q2.poll());
            }
            
            int temp = q2.poll();
            q1.offer(temp);
            return temp;
        } else {
            while (q1.size() != 1) {
                q2.offer(q1.poll());
            }
            
            int temp = q1.poll();
            q2.offer(temp);
            return temp;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}