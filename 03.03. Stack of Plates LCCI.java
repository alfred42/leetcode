class StackOfPlates {
    List<Stack<Integer>> stackArray;
    int capacity;

    public StackOfPlates(int cap) {
        this.capacity = cap;
        stackArray = new ArrayList<Stack<Integer>>();
    }
    
    public void push(int val) {
        if (capacity <= 0) return;
        if (stackArray.size() == 0 || stackArray.get(stackArray.size() - 1).size() == capacity) {
            Stack<Integer> stack = new Stack<>();
            stack.push(val);
            stackArray.add(stack);
        } else {
            stackArray.get(stackArray.size() - 1).push(val);
        }
    }
    
    public int pop() {
        if (stackArray.size() == 0) return -1;
        else {
            int temp = stackArray.get(stackArray.size() - 1).pop();
            if (stackArray.get(stackArray.size() - 1).size() == 0) stackArray.remove(stackArray.size() - 1);
            return temp;
        }
    }
    
    public int popAt(int index) {
        if (index >= stackArray.size()) return -1;
        else {
            int temp = stackArray.get(index).pop();
            if (stackArray.get(index).size() == 0) stackArray.remove(index);
            return temp;
        }

    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */