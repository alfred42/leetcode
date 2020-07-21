class SortedStack {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public SortedStack() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    
    public void push(int val) {
        stack1.push(val);
    }
    
    public void pop() {
        int min = Integer.MAX_VALUE;
        
        while (!stack1.isEmpty()) {
            int temp = stack1.pop();

            if (temp < min) {
                if (min != Integer.MAX_VALUE) {
                    stack2.push(min);
                }
                min = temp;
            } else {
                stack2.push(temp);
            }
        }

        stack1 = stack2;
        stack2 = new LinkedList<>();
    }
    
    public int peek() {
        int min = Integer.MAX_VALUE;

        while (!stack1.isEmpty()) {
            int temp = stack1.pop();

            if (temp < min) {
                if (min != Integer.MAX_VALUE) {
                    stack2.push(min);
                }
                min = temp;
            }  else {
                stack2.push(temp);
            }
        }

        if (min != Integer.MAX_VALUE) {
            stack2.push(min);
        }

        stack1 = stack2;
        stack2 = new LinkedList<>();

        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    public boolean isEmpty() {
        return stack1.size() == 0;
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */