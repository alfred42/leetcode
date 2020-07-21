class TripleInOne {
    private int NUMBER_OF_STACKS = 3;
    private int stackCapacity;
    private int [] values;
    private int[] sizes;

    public TripleInOne(int stackSize) {
        this.stackCapacity = stackSize;
        this.values = new int[NUMBER_OF_STACKS * stackCapacity];
        this.sizes = new int[NUMBER_OF_STACKS];
    }
    
    public void push(int stackNum, int value) {
        if (sizes[stackNum] == stackCapacity) return;

        values[stackCapacity * stackNum + sizes[stackNum]] = value;
        sizes[stackNum]++;
    }
    
    public int pop(int stackNum) {
        if (sizes[stackNum] == 0) return -1;

        int temp = values[stackCapacity * stackNum + sizes[stackNum] - 1];
        sizes[stackNum]--;

        return temp;
    }
    
    public int peek(int stackNum) {
        if (sizes[stackNum] == 0) return -1;

        return values[stackCapacity * stackNum + sizes[stackNum] - 1];

    }
    
    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }
}

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */